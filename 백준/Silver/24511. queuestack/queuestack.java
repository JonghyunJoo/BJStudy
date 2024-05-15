import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queueStack = new ArrayDeque<>();

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                queueStack.offer(Integer.parseInt(st.nextToken()));
            } else {
                st.nextToken();
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            queueStack.offerFirst(Integer.parseInt(st.nextToken()));
            bw.write(queueStack.pollLast() + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

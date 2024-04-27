import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> ACopy = new HashSet<>(A);

        Set<Integer> B = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        for (Integer integer : A) {
            if (B.contains(integer)) {
                ACopy.remove(integer);
                B.remove(integer);
            }
        }

        bw.write((ACopy.size() + B.size()) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

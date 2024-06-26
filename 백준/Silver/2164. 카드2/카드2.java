import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        bw.write(queue.peek() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

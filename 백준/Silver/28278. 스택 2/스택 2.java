import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());

            if (input == 1) {
                list.add(Integer.parseInt(st.nextToken()));
            } else if (input == 2) {
                if (list.size() == 0) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(list.get(list.size() - 1) + "\n");
                    list.remove(list.size() - 1);
                }
            } else if (input == 3) {
                bw.write(list.size() + "\n");
            } else if (input == 4) {
                if (list.size() == 0) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (input == 5) {
                if (list.size() == 0) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(list.get(list.size() - 1) + "\n");
                }
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
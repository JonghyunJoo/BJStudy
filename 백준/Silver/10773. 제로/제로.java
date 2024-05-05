import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(input);
            }
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        bw.write(sum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
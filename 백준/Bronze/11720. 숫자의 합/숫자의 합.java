import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static String[] arr;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = br.readLine().split("");

        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        bw.write(sum + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
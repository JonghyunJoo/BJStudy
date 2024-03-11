import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static String input;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            input = br.readLine();
            int n = Integer.parseInt(input);

            arr[n - 1] = 1;
        }
        for (int i = 0; i < 30; i++) {
            if (arr[i] != 1) {
                bw.write(i + 1 + "\n");
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
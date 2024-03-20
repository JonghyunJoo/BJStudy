import java.io.*;

public class Main {
    static String input;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N * 2; i++) {
            if (i < N) {
                for (int j = 0; j < N - i; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < i * 2 - 1; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            } else {
                for (int j = 0; j < i - N; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < 2 * (2 * N - i) - 1; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();

    }
}
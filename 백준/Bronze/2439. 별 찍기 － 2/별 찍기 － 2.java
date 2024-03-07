import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        int T = Integer.parseInt(str1);
        String[] star = new String[T];
        int n = T;
        Arrays.fill(star, " ");
        for (int i = 0; i < T; i++) {
            n--;
            star[n] = "*";
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < T; j++) {
                str.append(star[j]);
            }
            bw.write(str + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
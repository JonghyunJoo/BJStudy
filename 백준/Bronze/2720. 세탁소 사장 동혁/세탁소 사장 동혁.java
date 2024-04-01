import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            if (C >= 25) {
                bw.write(C / 25 + " ");
                C = C % 25;
            } else {
                bw.write(0 + " ");
            }
            if (C >= 10) {
                bw.write(C / 10 + " ");
                C = C % 10;
            } else {
                bw.write(0 + " ");
            }
            if (C >= 5) {
                bw.write(C / 5 + " ");
                C = C % 5;
            } else {
                bw.write(0 + " ");
            }
            bw.write(C + "\n");

        }
        bw.flush();
        br.close();
    }
}
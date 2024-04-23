import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] S = new String[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                if (S[j].equals(input)) {
                    count++;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

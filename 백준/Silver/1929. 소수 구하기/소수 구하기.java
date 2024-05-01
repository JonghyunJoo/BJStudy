import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int MaxN = 1000001;
        isPrime = new boolean[MaxN];
        isPrime(M, N);

        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void isPrime(int start, int end) {
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        for (int p = 2; p * p <= end; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= end; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }
}

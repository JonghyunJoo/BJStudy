import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        findPrimes(1000000);

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(countPair(N) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void findPrimes(int n) {
        isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    static int countPair(int N) {
        int count = 0;

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                if (i > N / 2) {
                    break;
                }
                if (isPrime[N - i]) {
                    count++;
                }
            }
        }
        return count;
    }
}
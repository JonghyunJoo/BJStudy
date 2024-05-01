import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                break;
            } else {
                int MaxN = 2 * input;
                isPrime = new boolean[MaxN + 1];
                isPrime(MaxN);
                
                int count = 0;
                for (int i = input + 1; i <= MaxN; i++) {
                    if (isPrime[i]) {
                        count++;
                    }
                }
                bw.write(count + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void isPrime(int end) {
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
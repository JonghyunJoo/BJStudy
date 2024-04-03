import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int A = 1;
        int B = 6;
        int cnt = 1;

        if (N == 1) {
            System.out.println(1);
            return;
        }
        while (A < N) {
            A += B;
            B += 6;
            cnt++;
        }

        System.out.println(cnt);
    }
}
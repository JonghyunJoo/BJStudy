import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (true) {
            if (N == 3) {
                N -= 3;
                cnt++;
            } else if (N == 4 || N == 7) {
                cnt = -1;
                break;
            } else if (N == 6) {
                N -= 6;
                cnt += 2;
            } else if (N == 9) {
                N -= 9;
                cnt += 3;
            } else if (N == 12) {
                N -= 12;
                cnt += 4;
            } else {
                N -= 5;
                cnt++;
            }
            if (N == 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
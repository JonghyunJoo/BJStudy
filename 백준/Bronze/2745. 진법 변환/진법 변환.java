import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static String N;
    static int B;
    static int sum;
    static char ch;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = st.nextToken();
        B = Integer.parseInt(st.nextToken());
        sum = 0;

        for (int i = 0; i < N.length(); i++) {
            ch = N.charAt(i);
            int num = 0;

            if (ch <= 57) {
                num = (ch - '0');
            } else if (ch >= 64) {
                num = ch - '7';
            }
            sum = sum * B + num;
        }
        System.out.println(sum);

        br.close();
    }
}
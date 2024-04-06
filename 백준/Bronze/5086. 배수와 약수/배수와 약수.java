import java.io.*;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0) {
                break;
            } else {
                if (A > B) {
                    if (A % B == 0) {
                        System.out.println("multiple");
                    } else {
                        System.out.println("neither");
                    }
                } else {
                    if (B % A == 0) {
                        System.out.println("factor");
                    } else {
                        System.out.println("neither");
                    }
                }
            }
        }
    }
}
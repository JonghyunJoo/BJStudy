import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 666; ; i++) {
            String str = String.valueOf(i);

            if (str.contains("666")) {
                count++;
            }
            if (count == N) {
                System.out.println(i);
                break;
            }
        }
    }
}
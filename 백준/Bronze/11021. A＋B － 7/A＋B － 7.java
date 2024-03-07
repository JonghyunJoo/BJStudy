import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        int T = Integer.parseInt(str1);

        for (int i = 1; i <= T; i++) {
            String str2 = br.readLine();
            String[] arr = str2.split(" ");

            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            int sum = A + B;

            bw.write("Case #" + i + ": " + sum + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
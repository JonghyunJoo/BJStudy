import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        int T = Integer.parseInt(str1);
        String star = "";
        for (int i = 1; i <= T; i++) {
            star += "*";
            bw.write(star + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
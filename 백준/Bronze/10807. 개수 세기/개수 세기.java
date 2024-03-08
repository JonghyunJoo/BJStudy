import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        int num1 = Integer.parseInt(str1);
        String str2 = br.readLine();
        String[] arr = str2.split(" ");
        String str3 = br.readLine();
        int count = 0;
        for (int i = 0; i < num1; i++) {
            if (arr[i].equals(str3)) {
                count++;
            }
        }
        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
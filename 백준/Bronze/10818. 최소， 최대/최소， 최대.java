import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        int N = Integer.parseInt(str1);
        String str2 = br.readLine();
        String[] strArr = str2.split(" ");
        int[] intArr = new int[N];
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);

        bw.write(intArr[0] + " " + intArr[N-1] + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
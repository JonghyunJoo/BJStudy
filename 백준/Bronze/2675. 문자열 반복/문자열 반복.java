import java.io.*;
import java.util.*;

public class Main {
    static String S;
    static int T;
    static int R;
    static String[] arr;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
           st= new StringTokenizer(br.readLine());
           R = Integer.parseInt(st.nextToken());
           S = st.nextToken();
           arr= S.split("");

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < R; k++) {
                    bw.write(arr[j]);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
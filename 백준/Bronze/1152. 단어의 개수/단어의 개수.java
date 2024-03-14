import java.io.*;
import java.util.*;

public class Main {
    static String S;
    static String[] arr;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        bw.write(st.countTokens() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
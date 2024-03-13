import java.io.*;
import java.util.*;

public class Main {
    static String input;
    static int T;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = br.readLine().charAt(0);

        bw.write(a + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}
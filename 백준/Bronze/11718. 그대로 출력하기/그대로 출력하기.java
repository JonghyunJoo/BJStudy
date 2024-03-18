import java.io.*;
import java.util.*;

public class Main {
    static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while ((S = br.readLine()) != null) {
            System.out.println(S);
        }
        bw.close();
        br.close();
    }
}
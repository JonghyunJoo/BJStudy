import java.io.*;
import java.util.*;

public class Main {
    static String input;
    static int T;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input = br.readLine();
            arr = input.split("");
            bw.write(arr[0] + arr[arr.length - 1] + "\n");

        }
        
        bw.flush();

        br.close();
        bw.close();
    }
}
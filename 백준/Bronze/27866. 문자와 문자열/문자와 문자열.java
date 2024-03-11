import java.io.*;
import java.util.*;

public class Main {
    static String input;
    static int i;
    static float sum;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine();
        arr = input.split("");
        i = Integer.parseInt(br.readLine());

        bw.write(arr[i - 1] + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}
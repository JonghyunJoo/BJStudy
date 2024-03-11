import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int N;
    static float sum;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        sum = 0;
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        Arrays.sort(arr);

        bw.write(sum * 100 / N / arr[N - 1]  + "\n");

        bw.flush();

        br.close();
        bw.close();
    }
}
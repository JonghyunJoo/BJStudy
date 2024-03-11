import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static String input;
    static int[] arr;
    static StringTokenizer st;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            while (I < J) {
                int temp = arr[I];
                arr[I] = arr[J];
                arr[J] = temp;
                I++;
                J--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
        }
        bw.write("\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
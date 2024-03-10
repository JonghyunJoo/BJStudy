import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static String input;
    static int N;
    static int M;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input = br.readLine();
        st = new StringTokenizer(input);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = 0;

            K = arr[I - 1];
            arr[I - 1] = arr[J - 1];
            arr[J - 1] = K;
            
        }
        for (int n = 0; n < arr.length; n++) {
            bw.write(arr[n] + " ");
        }
        bw.write("\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
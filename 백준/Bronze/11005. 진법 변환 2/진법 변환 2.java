import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int B;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();

        while (N >= B) {
            list.add(N % B);
            N = N / B;
        }
        list.add(N);
        Collections.reverse(list);

        for (int num : list) {
            if (num >= 10) {
                num += 55;
                bw.write((char) num + "");
            } else {
                num += 48;
                bw.write((char) num + "");
            }
        }
        bw.write("\n");
        bw.flush();
        br.close();
    }
}
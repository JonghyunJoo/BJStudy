import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] factors = new int[count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < factors.length; i++) {
            factors[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(factors);

        if (count % 2 == 0) {
            bw.write(factors[0] * factors[count - 1] + "\n");
        } else {
            bw.write(factors[count / 2] * factors[count / 2] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

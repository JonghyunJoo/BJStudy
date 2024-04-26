import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> cards = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(st.nextToken());
            if (cards.containsKey(input)) {
                cards.replace(input, cards.get(input) + 1);
            } else {
                cards.put(input, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            int input = Integer.parseInt(st.nextToken());
            if (cards.containsKey(input)) {
                bw.write(cards.get(input) + " ");
            } else {
                bw.write(0 + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

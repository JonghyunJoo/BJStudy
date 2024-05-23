import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Set<String> dancers = new HashSet<>();
        dancers.add("ChongChong");

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            if (dancers.contains(A) || dancers.contains(B)) {
                dancers.add(A);
                dancers.add(B);
            }
        }

        bw.write(dancers.size() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

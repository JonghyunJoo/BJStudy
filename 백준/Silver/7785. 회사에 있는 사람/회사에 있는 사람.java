import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();

            if (set.contains(person)) {
                set.remove(person);
            } else {
                set.add(person);
            }
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        for (String str : list) {
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

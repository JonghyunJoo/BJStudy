import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> list = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        int enter = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                enter++;
            } else {
                list.add(input + enter);
            }
        }
        bw.write(list.size() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

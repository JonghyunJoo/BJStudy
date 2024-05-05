import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            List<Character> list = new ArrayList<>();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if (list.isEmpty()) {
                    if (input.charAt(j) == '(') {
                        list.add('(');
                    } else {
                        list.add(')');
                        break;
                    }
                } else if (input.charAt(j) == list.get(list.size() - 1)) {
                    list.add('(');
                } else {
                    list.remove(list.size() - 1);
                }
            }
            if (list.isEmpty()) {
                bw.write("YES \n");
            } else {
                bw.write("NO \n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
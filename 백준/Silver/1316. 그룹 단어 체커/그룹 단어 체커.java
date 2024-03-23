import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String str;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            boolean[] arr = new boolean[26];
            boolean chk = true;
            char prev = ' ';

            for (int j = 0; j < str.length(); j++) {
                char cur = str.charAt(j);
                if (cur != prev) {
                    if (arr[cur - 'a']) {
                        chk = false;
                        break;
                    } else {
                        arr[cur - 'a'] = true;
                        prev = cur;
                    }
                }
            }
            if (chk) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
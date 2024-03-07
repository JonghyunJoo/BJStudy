import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = Integer.parseInt(str);
        String ans = "int";

        for (int i = 0; i < N / 4; i++) {
            ans = "long " + ans;
        }
        System.out.println(ans);
    }
}
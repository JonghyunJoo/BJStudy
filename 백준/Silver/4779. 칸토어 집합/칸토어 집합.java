import java.io.*;
import java.util.*;

public class Main {
    public static String cantor(int n) {
        if (n == 0) {
            return "-";
        }
        String side = cantor(n - 1);
        String middle = " ".repeat(side.length());
        return side + middle + side;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int N = Integer.parseInt(input);

            bw.write(cantor(N) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

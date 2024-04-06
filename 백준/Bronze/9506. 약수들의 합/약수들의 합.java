import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            if (n == -1) {
                break;
            } else {
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        list.add(i);
                    }
                }
                for (int m : list) {
                    sum += m;
                }
                if (sum == n) {
                    bw.write(n + " = " + list.get(0));
                    for (int i = 1; i < list.size(); i++) {
                        bw.write(" + " + list.get(i));
                    }
                    bw.write("\n");
                } else {
                    bw.write(n + " is NOT perfect. \n");
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
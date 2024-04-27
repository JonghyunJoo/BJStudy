import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;

        String[] arr = br.readLine().split("");

        Set<String> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            sb = new StringBuilder();
            for (int j = i; j < arr.length; j++) {
                sb.append(arr[j]);
                set.add(sb.toString());
            }
        }

        bw.write(set.size() + "\n");
        bw.flush();

        bw.close();
        br.close();
    }
}

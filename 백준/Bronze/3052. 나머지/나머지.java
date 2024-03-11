import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static String input;
    static HashSet<Integer> hs;
    static StringTokenizer st;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        hs = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            input = br.readLine();
            int n = Integer.parseInt(input)% 42;
            
            hs.add(n);
        }
        
        bw.write(hs.size() + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(fibonacci(N) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {
    static String S;
    static String[] arr;
    static Map<Integer, Integer> code;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        code = new HashMap<>();
        for (int i = 97; i <= 122; i++) {
            code.put(i, -1);
        }

        S = br.readLine();
        arr = S.split("");

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].charAt(0);
            if (code.get(a) == -1) {
                code.replace(a, i);
            }
        }
        for(int key : code.keySet()){
            bw.write(code.get(key) +" ");
        }
        
        bw.write("\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
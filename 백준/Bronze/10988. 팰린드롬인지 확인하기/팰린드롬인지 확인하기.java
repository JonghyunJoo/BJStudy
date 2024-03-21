import java.io.*;

public class Main {
    static int output;

    static String[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        arr = br.readLine().split("");
        output = 1;

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(arr[arr.length - 1 - i])) {
                output = 0;
            }
        }
        bw.write(output + "\n");

        bw.flush();
        bw.close();

    }
}
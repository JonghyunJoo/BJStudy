import java.io.*;

public class Main {
    static String input;
    static String[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] answer = {1, 1, 2, 2, 2, 8};
        input = br.readLine();
        arr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int N = Integer.parseInt(arr[i]);
            if (answer[i] == N) {
                bw.write(0 + " ");
            } else {
                bw.write((answer[i] - N) + " ");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();

    }
}
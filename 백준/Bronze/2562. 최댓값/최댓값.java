import java.io.*;

public class Main {
    static String input;
    static int count;
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        count = 0;
        num = 0;

        for (int i = 0; i < 9; i++) {
            input = br.readLine();
            int inputNum = Integer.parseInt(input);

            if (num < inputNum) {
                num = inputNum;
                count = i + 1;
            }
        }


        bw.write(num + "\n");
        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
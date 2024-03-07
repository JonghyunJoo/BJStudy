import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        int num = Integer.parseInt(str1);
        int[] intArr = new int[num];

        for (int i = 0; i < num; i++) {
            String str2 = br.readLine();
            String[] strArr = str2.split(" ");
            int A = Integer.parseInt(strArr[0]);
            int B = Integer.parseInt(strArr[1]);

            intArr[i] = A + B;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(intArr[i]);
        }

    }
}
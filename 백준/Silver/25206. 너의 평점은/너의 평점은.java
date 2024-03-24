import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String str;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double creditSum = 0;
        double totalSum = 0;

        for (int i = 0; i < 20; i++) {
            String[] arr = br.readLine().split(" ");
            double credit = Double.parseDouble(arr[1]);

            if (arr[2].equals("A+")) {
                totalSum += credit * 4.5;
                creditSum += credit;
            } else if (arr[2].equals("A0")) {
                totalSum += credit * 4.0;
                creditSum += credit;
            } else if (arr[2].equals("B+")) {
                totalSum += credit * 3.5;
                creditSum += credit;
            } else if (arr[2].equals("B0")) {
                totalSum += credit * 3.0;
                creditSum += credit;
            } else if (arr[2].equals("C+")) {
                totalSum += credit * 2.5;
                creditSum += credit;
            } else if (arr[2].equals("C0")) {
                totalSum += credit * 2.0;
                creditSum += credit;
            } else if (arr[2].equals("D+")) {
                totalSum += credit * 1.5;
                creditSum += credit;
            } else if (arr[2].equals("D0")) {
                totalSum += credit;
                creditSum += credit;
            }else if (arr[2].equals("F")) {
                totalSum += 0;
                creditSum += credit;
            }

        }
        System.out.println(totalSum/creditSum);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int X = Integer.parseInt(str);
        str = br.readLine();
        int N = Integer.parseInt(str);
        int sum = 0;

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            String[] arr = str.split(" ");

            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            sum += a * b;
        }
        if(X==sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
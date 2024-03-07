import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String[] arr = str1.split(" ");

        int H = Integer.parseInt(arr[0]);
        int M1 = Integer.parseInt(arr[1]);
        int M2 = Integer.parseInt(str2);

        H += (M1 + M2) / 60;
        if (H >= 24) {
            H -= 24;
        }
        int M = (M1 + M2) % 60;

        System.out.println(H + " " + M);
    }
}
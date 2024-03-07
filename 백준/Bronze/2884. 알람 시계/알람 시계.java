import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split(" ");

        int H = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        if (M < 45) {
            M = M + 60 - 45;
            if (H == 0) {
                H = 23;
            } else {
                H -= 1;
            }
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);
    }
}
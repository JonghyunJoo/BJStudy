import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int num = B;
        ArrayList<Integer> arr = new ArrayList<>();

        while (num > 0) {
            arr.add(num % 10);
            num /= 10;
        }

        System.out.println(A * arr.get(0));
        System.out.println(A * arr.get(1));
        System.out.println(A * arr.get(2));
        System.out.println(A * B);

        scanner.close();
    }
}
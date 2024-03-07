import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int p = 0;

        if (A == B && B == C) {
            p = 10000 + A * 1000;
        } else {
            if (A == B || B == C) {
                p = 1000 + B * 100;
            } else if (A == C) {
                p = 1000 + A * 100;
            } else {
                if (A > B && A > C) {
                    p = A * 100;
                } else if (B > C) {
                    p = B * 100;
                } else {
                    p = C * 100;
                }
            }
        }

        System.out.println(p);
    }
}
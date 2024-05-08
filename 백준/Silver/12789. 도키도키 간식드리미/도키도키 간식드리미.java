import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int expected = 1;
        Stack<Integer> stack = new Stack<>();

        while (st.hasMoreTokens()) {
            int student = Integer.parseInt(st.nextToken());

            if (student == expected) {
                expected++;
                while (!stack.isEmpty() && stack.peek() == expected) {
                    stack.pop();
                    expected++;
                }
            } else {
                stack.push(student);
            }
        }

        while (!stack.isEmpty() && stack.peek() == expected) {
            stack.pop();
            expected++;
        }

        if (stack.isEmpty()) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

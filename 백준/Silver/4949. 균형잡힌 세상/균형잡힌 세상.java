import java.io.*;
import java.util.*;

public class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            List<Character> list = new ArrayList<>();
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(' || input.charAt(j) == '[') {
                    list.add(input.charAt(j));
                } else if (input.charAt(j) == ')') {
                    if (!list.isEmpty()) {
                        if (list.get(list.size() - 1) == '(') {
                            list.remove(list.size() - 1);
                        } else {
                            break;
                        }
                    } else {
                        list.add(')');
                        break;
                    }
                } else if (input.charAt(j) == ']') {
                    if (!list.isEmpty()) {
                        if (list.get(list.size() - 1) == '[') {
                            list.remove(list.size() - 1);
                        } else {
                            break;
                        }
                    } else {
                        list.add(']');
                        break;
                    }
                }
            }
            if (list.isEmpty()) {
                bw.write("yes \n");
            } else {
                bw.write("no \n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
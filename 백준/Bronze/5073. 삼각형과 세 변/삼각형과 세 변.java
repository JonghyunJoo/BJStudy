import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> list;

        while (true) {
            st = new StringTokenizer(br.readLine());
            list = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);

            if (list.get(0) == 0) {
                return;
            }

            if (list.get(2) >= list.get(0) + list.get(1)) {
                System.out.println("Invalid");
            } else {
                if (list.get(0).equals(list.get(1)) && list.get(1).equals(list.get(2))) {
                    System.out.println("Equilateral");
                } else if (list.get(0).equals(list.get(1)) || list.get(1).equals(list.get(2)) || list.get(0).equals(list.get(2))) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
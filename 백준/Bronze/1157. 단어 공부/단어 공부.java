import java.io.*;
import java.util.*;

public class Main {
    static String input;
    static Map<String, Integer> map;
    static List<String> list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map = new HashMap<>();
        list = new ArrayList<>();
        input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            String s = String.valueOf(Character.toUpperCase(c));
            if (map.containsKey(s)) {
                map.replace(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = Collections.max(map.values());
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() == max) {
                list.add(m.getKey());
            }
        }
        if (list.size() == 1) {
            bw.write(list.get(0) + "\n");
        } else {
            bw.write("?\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
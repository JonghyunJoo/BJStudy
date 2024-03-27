import java.io.*;

public class Main {
    static String str;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i]= br.readLine();
        }
        StringBuilder result = new StringBuilder();
        int maxLength = 0;
        for (String s : arr) {
            maxLength = Math.max(maxLength, s.length());
        }

        for (int i = 0; i < maxLength; i++) {
            for (String word : arr) {
                if (i < word.length()) {
                    result.append(word.charAt(i));
                }
            }
        }
        System.out.println(result.toString());
        br.close();
    }
}
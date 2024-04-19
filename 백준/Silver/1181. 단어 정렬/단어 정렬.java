import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
           set.add(br.readLine());
        }
        String[] arr =  set.toArray(new String[0]);

        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.comparingInt(String::length));

        for (String str : arr){
            System.out.println(str);
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int tmp = 0;


        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

//        //버블 정렬
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//
//        //선택 정렬
//        for (int i = 0; i < arr.length; i++) {
//            int min = i;
//            for (int j = i; j < arr.length; j++) {
//                if (arr[min] > arr[j]) {
//                    min = j;
//                }
//                tmp = arr[i];
//                arr[i] = arr[min];
//                arr[min] = tmp;
//            }
//        }

        //삽입 정렬
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
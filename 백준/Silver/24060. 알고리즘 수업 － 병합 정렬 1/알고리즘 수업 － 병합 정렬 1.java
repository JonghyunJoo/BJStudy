import java.io.*;
import java.util.*;

public class Main {
    static int K;
    static int count = 0;
    static int result = -1;

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2; // q는 p와 r의 중간 지점
            mergeSort(A, p, q);  // 전반부 정렬
            mergeSort(A, q + 1, r);  // 후반부 정렬
            merge(A, p, q, r);  // 병합
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + 1 + j];
        }

        int i = 0, j = 0, k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            count++;
            if (count == K) {
                result = A[k];
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            count++;
            if (count == K) {
                result = A[k];
            }
            k++;
        }
        while (j < n2) {
            A[k] = R[j];
            j++;
            count++;
            if (count == K) {
                result = A[k];
            }
            k++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(A, 0, N - 1);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

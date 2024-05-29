import java.io.*;
import java.util.*;

public class Main {
    static int K;
    static int count = 0;
    static int result = -1;

    public static void mergeSort(int[] A, int[] tmp, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2; // q는 p와 r의 중간 지점
            mergeSort(A, tmp, p, q);  // 전반부 정렬
            mergeSort(A, tmp, q + 1, r);  // 후반부 정렬
            merge(A, tmp, p, q, r);  // 병합
        }
    }

    public static void merge(int[] A, int[] tmp, int p, int q, int r) {
        int i = p, j = q + 1, t = p;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t] = A[i];
                i++;
            } else {
                tmp[t] = A[j];
                j++;
            }
            count++;
            if (count == K) {
                result = tmp[t];
            }
            t++;
        }

        while (i <= q) {
            tmp[t] = A[i];
            i++;
            count++;
            if (count == K) {
                result = tmp[t];
            }
            t++;
        }

        while (j <= r) {
            tmp[t] = A[j];
            j++;
            count++;
            if (count == K) {
                result = tmp[t];
            }
            t++;
        }

        for (int k = p; k <= r; k++) {
            A[k] = tmp[k];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] tmp = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(A, tmp, 0, N - 1);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

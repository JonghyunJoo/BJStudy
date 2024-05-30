import java.io.*;
import java.util.*;

public class Main {
    public static void createStar(char[][] stars, int n, int row, int col, boolean blank) {
        if (blank) {
            for (int i = row; i < row + n; i++) {
                for (int j = col; j < col + n; j++) {
                    stars[i][j] = ' ';
                }
            }
            return;
        }
        if (n == 1) {
            stars[row][col] = '*';
            return;
        }
        int newSize = n / 3;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count++;
                createStar(stars, newSize, row + i * newSize, col + j * newSize, count == 5);
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        char[][] stars = new char[N][N];
        createStar(stars, N, 0, 0, false);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(stars[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numbers);

        // 산술평균
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avg = (double) sum / N;
        bw.write(Math.round(avg) + "\n");

        // 중앙값
        bw.write(numbers[N / 2] + "\n");

        // 최빈값
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbersMap.containsKey(numbers[i])) {
                numbersMap.replace(numbers[i], numbersMap.get(numbers[i]) + 1);
            } else {
                numbersMap.put(numbers[i], 1);
            }
        }

        List<Integer> modes = new ArrayList<>();
        int Max = Collections.max(numbersMap.values());

        for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()) {
            if (entry.getValue() == Max) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes);
        if (modes.size() == 1) {
            bw.write(modes.get(0) + "\n");
        } else {
            bw.write(modes.get(1) + "\n");
        }

        // 범위
        bw.write((numbers[N - 1] - numbers[0]) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

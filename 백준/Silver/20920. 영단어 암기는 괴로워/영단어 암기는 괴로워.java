import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.length() >= M) {
                words.put(input, words.getOrDefault(input, 0) + 1);
            }
        }

        List<Word> ordered = new ArrayList<>();

        for (Entry<String, Integer> entry : words.entrySet()) {
            ordered.add(new Word(entry.getKey(), entry.getValue()));
        }
        Collections.sort(ordered);

        for (Word word : ordered) {
            bw.write(word.getWord() + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

class Word implements Comparable<Word> {
    private String word;
    private int frequency;

    public Word(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    public String getWord() {
        return this.word;
    }

    @Override
    public int compareTo(Word o) {
        if (o.frequency > frequency) {
            return 1;
        } else if (o.frequency == frequency) {
            if (o.word.length() > word.length()) {
                return 1;
            } else if (o.word.length() == word.length()) {
                if (o.word.compareTo(word) < 0) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

}

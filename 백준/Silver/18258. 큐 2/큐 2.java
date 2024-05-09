import java.io.*;
import java.util.*;

public class Main {
    static class Queue {
        private LinkedList<Integer> list;

        public Queue() {
            list = new LinkedList<>();
        }

        public void push(int item) {
            list.add(item);
        }

        public int pop() {
            if (empty() == 1) {
                return -1;
            }
            return list.poll();
        }

        public int size() {
            return list.size();
        }

        public int empty() {
            if (list.isEmpty()) {
                return 1;
            } else {
                return 0;
            }
        }

        public int front() {
            if (empty() == 1) {
                return -1;
            } else {
                return list.peek();
            }
        }

        public int back() {
            if (empty() == 1) {
                return -1;
            } else {
                return list.peekLast();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue queue = new Queue();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(queue.pop() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write(queue.empty() + "\n");
                    break;
                case "front":
                    bw.write(queue.front() + "\n");
                    break;
                case "back":
                    bw.write(queue.back() + "\n");
                    break;
                default:
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

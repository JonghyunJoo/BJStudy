import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String[] arr1 = str1.split(" ");
        int N = Integer.parseInt(arr1[0]);
        int X = Integer.parseInt(arr1[1]);
        String str2 = br.readLine();
        String[] arr2 = str2.split(" ");

        for (int i = 0; i <N; i++) {
            if(Integer.parseInt(arr2[i])<X){
                bw.write(arr2[i] +" ");
            }
        }
        bw.write("\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
}
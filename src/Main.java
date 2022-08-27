import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1,1,2,2,2,8};
        int var = 0;
        for(int i = 0; i < 6; i ++){
            var = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(arr[i] - var) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
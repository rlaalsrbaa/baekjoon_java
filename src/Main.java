import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int arr[][] = new int[15][15];

        for (int i = 0; i < 15; i++) {
            arr[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        System.out.println(Arrays.deepToString(arr));

        bw.flush();
        bw.close();
        br.close();
    }
}
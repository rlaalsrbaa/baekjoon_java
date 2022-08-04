import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());
        int N = 0;
        int sum = 0;
        float avg = 0;
        float[] arr;
        int cnt = 0;

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            arr = new float[N];

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];

                if (j == N-1) {
                    avg = sum / N;

                    for (int k = 0; k < N; k++) {

                        if (arr[k] > avg) {
                            cnt++;
                        }

                    }
                    avg = (float) cnt / (float) N;
                    sum = 0;
                    cnt = 0;
                }

            }
            bw.write(String.format("%.3f%%\n", avg * 100));
        }

        bw.flush();
        br.close();
        bw.close();

    }
}

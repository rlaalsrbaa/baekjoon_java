import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int max = 0;
        int line = 0;

        int num = 0;
        int den = 0;

        while (max < X) {
            line += 1;
            max += line;
        }
        if (line % 2 == 0) {
            int step = max;
            num = line;
            den = 1;
            while (step > X) {
                num--;
                den++;
                step --;
            }
        } else {
            int step = max;
            num = 1;
            den = line;
            while (step > X) {
                num++;
                den--;
                step --;
            }
        }

        bw.write(String.format("%d/%d", num, den));

        bw.flush();
        bw.close();
        br.close();
    }
}
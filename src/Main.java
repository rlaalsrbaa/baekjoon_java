import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int temp = 1;
        int i = 0;

        if (N == 1) {
            i = 1;
        } else {
            while (true) {
                i++;
                temp = temp + (6 * i);
                if (N <= temp) {
                    i++;
                    break;
                }
            }
        }
        bw.write(Integer.toString(i) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
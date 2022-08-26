import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int temp = 1;
        int i = 0;

        while (true) {
            i++;
            temp = temp + (6 * i);
            if (N < temp) {
                i += 2;
                break;
            }
        }
        bw.write(Integer.toString(i)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
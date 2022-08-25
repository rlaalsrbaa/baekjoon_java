import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int brp = 0;
        int income = C - B;

        if (B > C || income == 0) {
            brp = -1;
        } else if (A == 0) {
            brp = 1;
        } else {
            brp = (A / income) + 1;
        }

        bw.write(Integer.toString(brp));

        bw.flush();
        bw.close();
        br.close();
    }
}
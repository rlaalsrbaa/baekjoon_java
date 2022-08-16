import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuffer sb1 = new StringBuffer(st.nextToken());
        StringBuffer sb2 = new StringBuffer(st.nextToken());

        int num1 = Integer.parseInt(sb1.reverse().toString());
        int num2 = Integer.parseInt(sb2.reverse().toString());

        if (num1 > num2) {
            bw.write(Integer.toString(num1));
        } else {
            bw.write(Integer.toString(num2));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
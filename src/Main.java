import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int floor = 0;
            int unit = 0;

            floor = N % H;
            unit = N / H;

            if(N % H == 0){
                floor = H;
            }else{
                unit++;
            }
            bw.write(String.format("%d\n",(floor*100) + unit));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
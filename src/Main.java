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

            if(H >= N){
                floor = N;
                unit = 1;
                bw.write(String.format("%d0%d\n",floor,unit));
            }else if(H == 1){
                floor = 1;
                unit = N;
                if(unit > 9){
                    bw.write(String.format("%d%d\n",floor,unit));
                }  else {
                    bw.write(String.format("%d0%d\n",floor,unit));
                }
            }else{
                floor = N % H;
                unit = (N / H);
                if(unit > 9){
                    bw.write(String.format("%d%d\n",floor,unit));
                }  else {
                    bw.write(String.format("%d0%d\n",floor,unit));
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
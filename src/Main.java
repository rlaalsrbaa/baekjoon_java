import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int ans = 0;

        ans = (V-A) / (A-B) + 1;
        if(((V-A) % (A-B)) != 0){
            ans = (V-A) / (A-B) + 2;
        }
        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}
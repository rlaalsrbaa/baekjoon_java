import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            if(decimalChecker(A)){
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));

        bw.flush();
        bw.close();
        br.close();
    }
    public static boolean decimalChecker(int A){
        boolean isdecimal = false;
        if(A == 1){
            return isdecimal;
        } else if (A == 2) {
            return true;
        }
        for(int j = 2; j < A; j++){
            if(A % j == 0){
                return isdecimal;
            }
        }
        isdecimal = true;
        return isdecimal;
    }
}
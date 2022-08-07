import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringBuilder P = new StringBuilder();

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            P.setLength(0);

            for(int j = 0; j < S.length(); j++){
                for(int k = 0; k < R; k++){
                    P.append(S.charAt(j));
                }
            }

            bw.write(P.toString());
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
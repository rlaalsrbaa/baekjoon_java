import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){
            int N = Integer.parseInt(br.readLine());
            int nn = 2 * N;
            int cnt = 0;

            boolean arr[] = new boolean[nn+1];
            if(N == 0){
                break;
            }
            for (int i = 2; i <= nn; i++) {
                arr[i] = true;
            }

            for (int i = 2; i * i <= nn; i++)
            {
                if (arr[i])
                    for (int j = i * i; j <= nn; j += i)
                        arr[j] = false;
            }
            for(int i = N+1; i <= nn; i++){
                if(arr[i]){
                    cnt++;
                }
            }
            bw.write(Integer.toString(cnt)+"\n");

            bw.flush();
        }


        bw.close();
        br.close();
    }
}
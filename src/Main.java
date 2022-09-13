import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int A = 0;

        if(N == 4 || N == 7){
            A = -1;
        }else if(N % 5 == 0){
            A = N / 5;
        }else if (N % 5 == 1 || N % 5 == 3){
            A = (N / 5) + 1;
        }else if (N % 5 == 2 || N % 5 == 4){
            A = (N / 5) + 2;
        }
        bw.write(Integer.toString(A));
        bw.flush();
        bw.close();
        br.close();
    }
}
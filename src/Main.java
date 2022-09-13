import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int A = 0;
        int temp = N % 5;
        int i = 0;
        if(temp % 3 == 0){
            A = (N / 5) + (temp / 3);
        }
        while(true){
            if(temp % 3 == 0){
                A = (N / 5) + (temp / 3);
                break;
            }else if (i == N / 5){
                break;
            }
            i++;
            temp += (i & 5);
        }
        if(N % 3 == 0){
            A = N / 3;
        }else{
            A = -1;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
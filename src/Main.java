import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        boolean isCheckedMinValue = false;
        int min = 0;
        int total = 0;

        for (int i = M; i <= N; i++) {
            if(decimalChecker(i)){
                total += i;
                if(!isCheckedMinValue){
                    min = i;
                    isCheckedMinValue = true;
                }
            }
        }
        if(isCheckedMinValue){
            bw.write(String.format("%d\n%d",total,min));
        }else{
            bw.write(String.format("-1"));
        }


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
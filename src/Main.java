import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int i = 2;
        if (N != 1) {
            while (true) {
                if (N % i == 0) {
                    if (decimalChecker(i)) {
                        N = N / i;
                        bw.write(Integer.toString(i) + "\n");
                        if (N == 1) {
                            break;
                        }
                        continue;
                    }
                }
                i++;
            }
            bw.flush();
        }


        bw.close();
        br.close();
    }

    public static boolean decimalChecker(int A) {
        boolean isdecimal = false;

        for (int j = 2; j < A; j++) {
            if (A % j == 0) {
                return isdecimal;
            }
        }
        isdecimal = true;
        return isdecimal;
    }
}
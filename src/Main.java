import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        char[] arr = S.toCharArray();
        int des = 0;

        for (int i = 97; i <= 122; i++) {

            for (int j = 0; j < S.length(); j++) {

                if (arr[j] == i) {
                    bw.write(Integer.toString(des) + " ");
                    des = 0;
                    break;

                } else if (j == S.length() - 1) {
                    bw.write("-1 ");
                    des = 0;
                    break;
                }
                des++;

            }


        }

        bw.flush();
        bw.close();
        br.close();

    }
}
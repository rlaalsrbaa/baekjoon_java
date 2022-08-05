import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int qst = Integer.parseInt(br.readLine());
        solution(qst);
    }

    public static void solution(int qst) {
        int cnt = 0;
        String str;
        int a;
        int b;
        int c;
        for (int i = 1; i <= qst; i++) {

            if (i < 100) {
                cnt++;
                continue;
            }
            str = Integer.toString(i);
            a = str.charAt(0)-48;
            b = str.charAt(1)-48;
            c = str.charAt(2)-48;
            if(a == b && b == c){
                cnt++;
            }
            else if(a < b && b < c && (b - a) == (c - b)){
                cnt++;
            }
            else if(a > b && b > c && (a - b)==(b - c)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
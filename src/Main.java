import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < tc; i++){
            String word = br.readLine();
            List<Character> temp = new ArrayList<>();
            char var = 0;
            int checker = 1;
            for(int j = 0; j < word.length(); j++){
                if(temp.contains(word.charAt(j)) && var != word.charAt(j)){
                    checker = 0;
                }
                var = word.charAt(j);
                temp.add(word.charAt(j));
            }
            cnt += checker;
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
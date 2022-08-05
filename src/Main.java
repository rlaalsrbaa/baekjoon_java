import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int con = 0;
        List<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= 10000; i++){
            String str = Integer.toString(i);

            for(int j = 0; j < str.length(); j++){

                con += (str.charAt(j) - 48);
            }

            arr.add(con + i);
            con = 0;
        }

        for (int i = 1; i <= 10000; i++){
            if(arr.contains(i)){
                continue;
            }
            bw.write(Integer.toString(i)+"\n");
        }

        bw.flush();
        br.close();
        bw.close();

    }


}

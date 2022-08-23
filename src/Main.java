import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String str2 = "";
        String alphabet = "";
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            str2 += str.charAt(i);
            alphabet = getCroatiaAlphabet(str2);
            if(alphabet != ""){
                str2 = str2.replace(alphabet,"");
                cnt++;
            }
        }
        System.out.println(str2);
        cnt += str2.length();
        bw.write(Integer.toString(cnt));

        bw.flush();
        bw.close();
        br.close();
    }

    private static String getCroatiaAlphabet(String str2) {
        String str = "";
        if(str2.contains("c=")){
            str = "c=";
            return str;
        } else if (str2.contains("c-")) {
            str = "c-";
            return str;
        } else if (str2.contains("dz=")) {
            str = "dz=";
            return str;
        } else if (str2.contains("d-")) {
            str = "d-";
            return str;
        } else if (str2.contains("lj")) {
            str = "lj";
            return str;
        } else if (str2.contains("nj")) {
            str = "nj";
            return str;
        } else if (str2.contains("s=")) {
            str = "s=";
            return str;
        } else if (str2.contains("z=")) {
            str = "z=";
            return str;
        }
        return str;
    }

    public static int getTime(char a){
        int time = 0;


        return time;
    }
}
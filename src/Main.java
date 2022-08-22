import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int time = 0;
        for(int i = 0; i < str.length(); i++){
            char var = str.charAt(i);
            time += getTime(var);
        }


        bw.write(Integer.toString(time));

        bw.flush();
        bw.close();
        br.close();
    }
    public static int getTime(char a){
        int time = 0;
        if(a >= 65 && a <= 90){
            if(a <= 67){ // ABC - 2
                time = 3;
            }else if(a <= 70){ // DEF - 3
                time = 4;
            }else if(a <= 73){ // GHI - 4
                time = 5;
            }else if(a <= 76){ // JKL - 5
                time = 6;
            }else if(a <= 79){ // MNO - 6
                time = 7;
            }else if(a <= 83){ // PQRS - 7
                time = 8;
            }else if(a <= 86){ // TUV - 8
                time = 9;
            }else{ // WXYZ - 9
                time = 10;
            }
        }
        return time;
    }
}
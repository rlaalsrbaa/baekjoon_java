import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int T = Integer.parseInt(br.readLine());


    for(int i = 1; i <= T; i++){
      String star = "*";
      String repeat = star.repeat(i);
      for(int j=T-1; j >= i; j--){
        bw.write(" ");
      }
      bw.write(String.format("%s\n",repeat));
    }

    bw.flush();
    br.close();
    bw.close();

  }
}

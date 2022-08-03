import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    int cnt = 0;
    int score = 0;

    for(int i = 0; i < N; i++){
      String[] str = new String[N];
      str[i] = br.readLine();

      for(int j = 0; j < str[i].length(); j++){
        if(str[i].charAt(j) == 'O'){
          cnt++;
          score += cnt;
        }
        else{
          cnt = 0;
        }
      }

      bw.write(Integer.toString(score)+"\n");
      score = 0;
      cnt = 0;
    }

    bw.flush();
    br.close();
    bw.close();

  }
}

import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    StringTokenizer st2 = new StringTokenizer(br.readLine());

    for(int i = 1; i <= N; i++){
      int A = Integer.parseInt(st2.nextToken());
      if(A < X){
        bw.write(A + " ");
      }
    }

    bw.flush();
    br.close();
    bw.close();

  }
}

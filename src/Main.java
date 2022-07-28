import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int temp = N;

    for(int i=1;;i++){
      temp = (temp % 10 * 10) + ((temp % 10 + temp / 10) % 10);

      if(temp == N){
        bw.write(String.format("%d\n",i));
        break;
      }
    }

    bw.flush();
    br.close();
    bw.close();

  }
}

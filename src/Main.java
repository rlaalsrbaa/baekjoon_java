import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int A=0;
    int B=0;
    String str;

    while((str=br.readLine()) != null){
      StringTokenizer st = new StringTokenizer(str);

      if(!st.hasMoreTokens()){
        break;
      }

      A = Integer.parseInt(st.nextToken());
      B = Integer.parseInt(st.nextToken());

      bw.write(String.format("%d\n",A+B));
    }

    bw.flush();
    br.close();
    bw.close();

  }
}

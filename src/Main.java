import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] arr = new int[9];
    int max = 0;
    int des = 1;

    for(int i = 0; i < 9; i++){
      arr[i] = Integer.parseInt(br.readLine());
      if(i == 0){
        max = arr[0];
      }
      else if(max < arr[i]){
        max = arr[i];
        des = i+1;
      }
    }

    bw.write(String.format("%d\n",max));
    bw.write(String.format("%d\n",des));

    bw.flush();
    br.close();
    bw.close();

  }
}

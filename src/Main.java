import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = new int[N];
    int max = 0;
    int min = 0;

    for(int i = 0; i < N; i++){
      arr[i] = Integer.parseInt(st.nextToken());

      if(i == 0){
        min = arr[i];
        max = arr[i];
      }
      else if(arr[i] > max){
        max = arr[i];
      }
      else if(min > arr[i]){
        min = arr[i];
      }
    }
    bw.write(String.format("%d %d\n",min, max));

    bw.flush();
    br.close();
    bw.close();

  }
}

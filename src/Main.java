import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    float[] arr = new float[N];
    float max = 0;
    float res = 0;

    for(int i = 0; i < N; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);
    max = arr[arr.length-1];
    for(int i = 0; i < N; i++){
      arr[i] = arr[i] / max * 100;
      res += arr[i];
    }
    res = res / N;
    System.out.println(res);
    bw.flush();
    br.close();
    bw.close();

  }
}

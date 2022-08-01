import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int cnt = 10;
    int[] arr = new int[10];

    for(int i = 0; i <= 9; i++){
      arr[i] = Integer.parseInt(br.readLine()) % 42;
    }

    Arrays.sort(arr);

    for(int i = 0; i <= 9; i++){
      if(i > 0 && arr[i] % 42 == arr[i-1] % 42){
        cnt--;
      }
    }

    bw.write(Integer.toString(cnt));
    bw.flush();
    br.close();
    bw.close();

  }
}

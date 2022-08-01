import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int cnt = 0;
    String mul = String.valueOf(A * B * C);
    char[] arr = mul.toCharArray();

    for(int i = 0; i <= 9; i++){
      for(int j = 0; j < arr.length; j++){
        if(arr[j]-'0' == i){
          cnt++;
        }
      }
      bw.write(String.format("%d\n",cnt));
      cnt = 0;
    }



    bw.flush();
    br.close();
    bw.close();

  }
}

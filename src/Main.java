import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    B = B + C;

    if(B >= 60){
      int j = B / 60;
      A = A + j;
      B = B % 60;
      if(A >= 24){
        A = A - 24;
      }
    }

    System.out.printf("%d %d",A,B);
    sc.close();
  }
}

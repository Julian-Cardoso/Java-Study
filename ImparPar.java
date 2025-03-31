import java.util.Scanner;

public class ImparPar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

  while(true) {
    int n1 = scanner.nextInt();
      if(n1 % 2 == 1){
        System.out.println("impar");
      } else {
        System.out.println("par");
      }
    }
  }
}

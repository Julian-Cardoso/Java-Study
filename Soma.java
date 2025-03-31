import java.util.Scanner;

public class Soma {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n1= scanner.nextInt();
    int n2= scanner.nextInt();

    int result = n1 + n2;

    System.out.println(result);
    scanner.close();
  }
}

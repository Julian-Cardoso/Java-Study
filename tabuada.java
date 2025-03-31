import java.util.Scanner;

public class tabuada {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int numBase = scanner.nextInt();

    System.out.println("\nAdição: ");
    for(int i = 0; i <= 10; i++){
      int result = numBase + i;
      System.out.printf("%d + %d = %d\n", i, numBase, result);
    }

    System.out.println("\nSubtração: ");
    for(int i = 0; i <= 10; i++){
      int result = i - numBase;
      System.out.printf("%d - %d = %d\n", i, numBase, result);
    }

    System.out.println("\nMultiplicação: ");
    for(int i = 0; i <= 10; i++){
      int result = numBase * i;
      System.out.printf("%d * %d = %d\n", i, numBase, result);
    }

    System.out.println("\nDivisão: ");
    for(int i = 1; i <= 10; i++){
      int result = numBase * i;
      System.out.printf("%d / %d = %d\n", result, numBase, i);
    }

    scanner.close();
  }
}

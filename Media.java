import java.util.Scanner;
  
public class Media{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua primeira nota: ");
      float nota1 = scanner.nextFloat();
    System.out.println("Digite sua segunda nota: ");
      float nota2 =scanner.nextFloat();
    System.out.println("Digite sua terceira nota: ");
      float nota3 = scanner.nextFloat();

      float media = (nota1 + nota2 + nota3) / 3;
    System.out.println("A média é: " + media);

      if (media >=7) {
        System.out.println("Aprovado");
      } else if (media >= 5) {
        System.out.println("Recuperação");
      } else {
        System.out.println("Reprovado");
      }
    scanner.close();
    }
  }
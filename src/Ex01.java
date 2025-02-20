import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       System.out.println("Digite um número inteiro:");
       int numA = sc.nextInt();

       System.out.println("Digite outro número inteiro:");
       int numB = sc.nextInt();

       int soma = numA + numB;

         System.out.println("SOMA = " + soma);
    }
}
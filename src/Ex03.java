import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A;
        int B;
        int C;
        int D;
        
        System.out.println("Digite o valor de A, B, C e D: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
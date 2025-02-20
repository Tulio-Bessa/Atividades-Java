import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        Double area;
        Double raio;
        Double pi = 3.14159;

        raio = sc.nextDouble();  // aguarda o usuário digitar o valor do raio
        area = pi * raio * raio;    
        
        System.out.printf(" area = %.4f%n", area);


        
	}
}
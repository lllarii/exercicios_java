package exerciciosLoops;
import java.util.Scanner;
 
public class ExFor {
	
	public static void main(String[] args) {
		int n;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n = entrada.nextInt();
				
		for(int i=2; i<=n; i++) {
			if( n%i == 0) {
				System.out.println(i);
			}
		}
 
	}
 
}
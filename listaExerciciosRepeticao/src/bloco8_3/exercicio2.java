package bloco8_3;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que lê	dois números inteiros do teclado, testa	se o primeiro é menor que o segundo,se for imprime todos os números	do intervalo entre eles;	

		int n1 = 0, n2 = 0;
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite o primeiro número inteiro: ");
			n1 = entrada.nextInt();
			
			System.out.println("Digite o segundo número inteiro: ");
			n2 = entrada.nextInt();
			
			if (n1 < n2) {
				for (int i = n1 + 1; i < n2; i++) {
					System.out.println(i);
				}
			}
		
	}

}

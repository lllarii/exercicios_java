package bloco8_3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// Faça	um	programa que lê	um número real do teclado e	utilizando o comando “while” calcula o fatorial	deste número. (ex: 5! é igual a 5 *	4 * 3 * 2 * 1).
		
		Scanner entrada = new Scanner(System.in);
		double numero, fatorial = 1, calculo;
		
		System.out.println("Digite um número: ");
		numero = entrada.nextDouble();
		calculo = numero;
	
		while (calculo > 0) {
			
			if ((calculo-1) > 0) 
			{
				fatorial = fatorial * calculo * (calculo-1);
			}
			else 
			{
				fatorial = fatorial * 1;
			}
			
		calculo = calculo - 2;
		}
		
		if(numero == 0) {
			System.out.println("Não calculamos o fatorial quando o número digitado é 0.");
		}
		else {
			System.out.println("O fatorial do número " + numero + " é: " + fatorial);
		}
		
	}

}

package bloco8_3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// Para	que	a divisão entre	2 números possa	ser	realizada, o divisor não pode ser nulo (zero). Escreva um programa para	ler	2 valores e imprimir o resultado da	divisão	do	primeiro pelo segundo.OBS: O programa deve validar a leitura do segundo valor (que não deve	ser	nulo). Enquanto	for	fornecido um valor nulo	a leitura deve ser repetida. Utilize a estrutura de	repetição na construção	da repetição de	validação.
		
		double n1, n2, div;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite o primeiro número: ");
			n1 = entrada.nextDouble();
			System.out.println("Digite o segundo número: ");
			n2 = entrada.nextDouble();
		}while(n2 == 0);
		
		div = n1/n2;
		System.out.println("O resultado da divisão entre os números "+n1+" e "+n2+" é: "+div);
		
		
	}

}

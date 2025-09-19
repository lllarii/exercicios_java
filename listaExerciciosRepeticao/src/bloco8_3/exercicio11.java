package bloco8_3;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		//  Faça um	programa que leia um número	indeterminado de idades. A última idade lida, que não entrará nos cálculos, deverá ser igual a zero. Ao final programa deverá escrever quantas idades foram lidas, calcular e escrever a média de idade desse grupo de idades.
		
		Scanner entrada = new Scanner(System.in);
		int idade, quantidade=0;
		double media, soma=0;
		
		do {
			System.out.println("Digite uma idade: ");
			idade = entrada.nextInt();
			
			if(idade > 0) {
				soma= soma+idade;
				quantidade++;
			}
	
		}while(idade != 0);
		
		
		if (quantidade > 0) {
		    media = soma / quantidade;
		    System.out.println("Quantidade de idades lidas: " + quantidade);
		    System.out.println("A média de idades do grupo é: " + media);
		} else {
		    System.out.println("Nenhuma idade válida foi informada para calcular a média.");
		}

	}

}

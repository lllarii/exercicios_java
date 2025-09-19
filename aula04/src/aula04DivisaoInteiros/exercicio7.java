package aula04DivisaoInteiros;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// Exercício 07 - Calculadora com verificações e biblioteca matemática;
		
		Scanner entrada = new Scanner(System.in);
		int opcao, n1, n2;
		n2 = 0;
		
		System.out.println("**CALCULADORA ONLINE**");
		System.out.println("MENU:");
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		System.out.println("5- Exponenciação");
		System.out.println("6- Raiz quadrada");
		System.out.println("Digite o número da operação que deseja realizar: ");
		opcao = entrada.nextInt();
		if ((opcao < 1) || (opcao > 6)) {
			System.out.println("Digite uma opção válida!");
			return;
		}
		
		if (opcao == 6) {
			System.out.println("Digite o número que deseja calcular a raiz quadrada: ");
			n1 = entrada.nextInt();	
			if (n1 < 0) {
				System.out.println("Não é possível calcular a raiz de um número negativo.");
				System.out.println("Tente novamente!");
				return;
			}
		}
		else {
			System.out.println("Digite o primeiro número da operação: ");
			n1 = entrada.nextInt();
			System.out.println("Digite o segundo número da operação: ");
			n2 = entrada.nextInt();
			if (opcao == 4) {
				if (n1 == 0 || n2 == 0) {
					System.out.println("Não é possível realizar divisão por zero.");
					System.out.println("Tente novamente!");
					return;
				}
			}
		}
		
		switch (opcao) {
		case 1:
			System.out.println("O resultado da soma é: "+(n1+n2));
			break;		
		case 2:
			System.out.println("O resultado da subtração é: "+ (n1-n2));
			break;
		case 3:
			System.out.println("O resultado da multiplicação é: "+ (n1*n2));
			break;
		case 4:
			System.out.println("O resultado da divisão é: "+ (n1/n2));
			break;
		case 5:
			System.out.println("O resultado da exponenciação é: "+ Math.pow(n1,  n2));
			break;
		case 6:
			System.out.println("O valor da raiz quadrada é: "+ Math.sqrt(n1));
			break;
		}

	}

}


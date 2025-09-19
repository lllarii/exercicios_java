package bloco8_3;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// Reescreva o programa	para o exercício 5 para	que	no final seja impressa a mensagem Novo cálculo (1.sim 2.não) solicitando ao	usuário	que	informe um código (1 ou	2) indicando se	ele	deseja ou não executar o programa novamente. Se	for	informado o	código 1 deve ser repetida a execução de todo o	program para permitir um novo cálculo, caso	contrário ele deve ser encerrado.
		
		double n1, n2, div;
		char novo = '0';
		Scanner entrada = new Scanner(System.in);
		
		do {
			do {
				System.out.println("Digite o primeiro número: ");
				n1 = entrada.nextDouble();
				System.out.println("Digite o segundo número: ");
				n2 = entrada.nextDouble();
			}while(n2 == 0);
			
			div = n1/n2;
			System.out.println("O resultado da divisão entre os números "+n1+" e "+n2+" é: "+div);
			
			System.out.println("Deseja realizar um novo cálculo?");
			System.out.println("1.sim");
			System.out.println("2.não");
			novo = entrada.next().charAt(0);
		}while(novo == '1');
		
		System.out.println("Obrigada por utilizar o sistema!");

	}

}

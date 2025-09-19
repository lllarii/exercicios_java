package bloco8_3;
import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		//Faça um programa utilizando o comando “while”, que fica lendo números inteiros do teclado e só finaliza quando o número digitado for 10.	
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		while(numero != 10) {
			System.out.println("Digite um número inteiro: ");
			numero = entrada.nextInt();
		}
		System.out.println("Você digitou 10 e encerrou o looping!");
		
	}

}

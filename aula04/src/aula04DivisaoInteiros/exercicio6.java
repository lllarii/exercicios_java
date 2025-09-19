package aula04DivisaoInteiros;

import java.util.Scanner;


public class exercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, inv, unidade, dezena, centena, quo;
		
		System.out.print("Digite um número inteiro de três digitos: ");
		num = entrada.nextInt();
		
		unidade = num % 10;
		quo = num / 10;
		dezena = quo % 10;
		centena = quo / 10;
		
		inv = unidade * 100 + dezena * 10 + centena;
		
		System.out.print("O número invertido é: "+ inv);
		
	}
 
}

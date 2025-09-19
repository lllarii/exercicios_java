package aula04DivisaoInteiros;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia, mes, ano, perfil;
		
		System.out.print("Digite o dia do seu nascimento: ");
		dia = entrada.nextInt();
		
		System.out.print("Digite o mês do seu nascimento: ");
		mes = entrada.nextInt();
		
		System.out.print("Digite o ano do seu nascimento: ");
		ano = entrada.nextInt();
		
		perfil = (dia+mes+ano)%5;
				
		switch (perfil) {
		case 0:
			System.out.print("O seu perfil é tímido.");
			break;
		case 1:
			System.out.print("O seu perfil é sonhador.");
			break;
		case 2:
			System.out.print("O seu perfil é paquerador.");
			break;
		case 3:
			System.out.print("O seu perfil é atraente.");
			break;
		case 4:
			System.out.print("O seu perfil é irresistível.");
			break;
			
			}

		}

}

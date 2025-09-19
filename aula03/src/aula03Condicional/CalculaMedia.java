package aula03Condicional;

import java.util.Scanner;

public class CalculaMedia 
{
	
	public static void main (String[] args) 
	{
	Scanner entrada = new Scanner(System.in);
	String nome;
	double n1, n2, media;
	
	System.out.print("Digite seu nome: ");
	nome = entrada.nextLine();
	
	System.out.print("Digite a primeira nota: ");
	n1 = entrada.nextDouble();
	
	System.out.print("Digite a segunda nota: ");
	n2 = entrada.nextDouble();
	
	media = (n1+n2)/2;
	
	//System.out.print("Olá, "+nome+". O valor da sua média é: "+media);
	System.out.printf("Olá, %s. O valor da sua média é: %.2f", nome, media);
	
		if (media >= 6) {
			System.out.print("\nSituação: Aprovado");
			
		}
		else {
			System.out.print("\nSituação: Reprovado");
		}
	
	}

}

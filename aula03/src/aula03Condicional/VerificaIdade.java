package aula03Condicional;
 
import java.util.Scanner;
 
public class VerificaIdade
{
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		if (idade >= 18)
			System.out.print("\nMaior de idade");		
		else
			System.out.print("\nMenor de idade");		
	}
 
}
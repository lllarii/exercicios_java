package aula03Condicional;
 
import java.util.Scanner;
 
public class VerificaSinal
{
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.print("Digite um número: ");
		numero = entrada.nextDouble();
		
		if (numero < 0)
			System.out.print("\nÉ negativo!");		
	
	}
 
}
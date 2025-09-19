package aula03Condicional;
 
import java.util.Scanner;
 
public class SalarioLiquido {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double salario, aumento;
				
		System.out.print("Digite o seu salario: ");
		salario = entrada.nextDouble();
				
		if (salario < 1500) {
			aumento = (salario * 15 /100) + salario;
			System.out.print("\nVocê recebeu um aumento! O seu novo salário é: "+ aumento);
		}
		else {
			System.out.print("\nVocê não foi contemplado pelo aumento.");
		}
		
 
	}
}
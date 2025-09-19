package exerciciosRepeticao;
import java.util.Scanner;
 
public class CalcularMedia {
 
	public static void main(String[] args) {
		double numero=0, soma=0, media;
		int qnt=0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			soma = soma + numero;
			if (numero != 0) {
				qnt++;
			}
		}while (numero != 0);
		
		media = soma/qnt;
		if (qnt == 0) {
			System.out.println("Você não tem nada pra calcular aí");
		}
		else {
			System.out.println("O valor da média é: "+media);
		}
		
 
	}
 
}
package exerciciosRepeticao;

import java.util.Scanner;
import java.util.Random;

public class JogoAdvinha {

	public static void main(String[] args) {
		int numero, tentativas = 0, palpite, max;
		Scanner entrada = new Scanner(System.in);
		Random sorteador = new Random();
		
		max = 100;
		//sortear o número
		numero = sorteador.nextInt(max)+1;
		
		System.out.println("Teste sua sorte!");
		
		do 
		{
			System.out.println("Digite um número entre 1 e " +max+": ");
			palpite = entrada.nextInt();
			if(palpite <1 || palpite > 100) 
			{
				System.out.println("Isso aí não, meu anjo");
			}
			tentativas = tentativas + 1;
			
			switch(tentativas) {
			case 1:
				System.out.println("Estamos só começando!");
				break;
			case 4:
				System.out.println("Bora, bora, boraaa!");
				break;
			case 10:
				System.out.println("Eu ainda acredito.");
				break;
			case 20:
				System.out.println("Esse é o seu vigésimo erro!");
				break;
			case 35:
				System.out.println("Acho que até eu esqueci o número correto...");
				break;
			case 36:
				System.out.println("Na verdade, eu sei o número, já você...");
				break;
			case 95:
				System.out.println("Poderia continuar aqui o dia todo, né?");
				break;
			}
			
			
			if(tentativas == 3) 
			{
				if(numero % 2 == 0) {
					System.out.println("DICA: Você está procurando por um número par.");
				}
				else {
					System.out.println("DICA: Você está procurando por um número impar.");
				}
			}
			
			if(tentativas >= 5)
			{
				if(palpite>numero) {
					System.out.println("DICA: O número procurado é menor.");
				}
				else if (palpite<numero){
					System.out.println("DICA: O número procurado é maior.");
				}
			}
			
			
		}while (palpite != numero);
		
		System.out.println("Arrasou!!");
		//bônus para finalizar
		switch(tentativas) {
		case 1:
			System.out.println("Dê primeira? Gastou sua sorte do ano aqui.");
			break;
		case 6:
			System.out.println("Você é hexa em errar!");
			break;
		case 15:
			System.out.println("Já estava desesperadx, né?");
			break;
		case 45:
			System.out.println("Achei que não ia parar mais");
			break;
		case 60:
			System.out.println("Venceu o sistema pelo cansaço.");
			break;
		case 85:
			System.out.println("Se não fosse agora, não ia nunca mais.");
			break;
		case 90:
			System.out.println("Eu já ia te interromper, mesmo...");
			break;
		}
		
		
	}

}

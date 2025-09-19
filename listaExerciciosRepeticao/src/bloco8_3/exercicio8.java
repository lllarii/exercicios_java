package bloco8_3;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// Reescreva o programa	do	exercício 6 validando a	resposta do	usuário	para a pergunta	Novo Cálculo (1.sim	2.não)?(aceitar	apenas o código	1 ou 2).
		
		double n1, n2, media;
		char novo = '0';
		Scanner entrada = new Scanner(System.in);
		
		do {
			do {
				System.out.println("Digite a primeira nota: ");
				n1 = entrada.nextDouble();
				if (n1 < 0 || n1 > 10) {
					System.out.println("Nota inválida!");
				}
			}while(n1 < 0 || n1 > 10);
			
			do {
				System.out.println("Digite a segunda nota: ");
				n2 = entrada.nextDouble();
				if (n2 < 0 || n2 > 10) {
					System.out.println("Nota inválida!");
				}
			}while(n2 < 0 || n2 > 10);
			
			media = (n1+n2)/2;
			System.out.println("A média semestral é: "+ media);
			
			do {
				System.out.println("Deseja realizar um novo cálculo?");
				System.out.println("1.sim");
				System.out.println("2.não");
				novo = entrada.next().charAt(0);
			}while(novo != '1' && novo != '2');
			
		}while(novo == '1');
		
		System.out.println("Obrigada por utilizar o sistema!");
	}

}

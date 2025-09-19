package bloco8_3;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// Escreva	um	programa para ler as notas da 1ª e 2ª avaliaçõe	de um aluno, calcular e imprimir a média semestral. Faça com que o algoritmo só	aceite notas válidas (uma nota válida deve pertencer ao	intervalo [0,10]). Cada	nota deve ser validada separadamente. Deve ser impressa	a mensagem "Nota inválida" caso	a nota informada não pertença ao intervalo [0,10].
		double n1, n2, media;
		Scanner entrada = new Scanner(System.in);
		
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

	}

}

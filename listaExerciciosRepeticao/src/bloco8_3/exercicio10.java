package bloco8_3;

public class exercicio10 {

	public static void main(String[] args) {
		// Escreva um programa para	determinar e escrever a	soma dos números pares de 100 a	200

	int soma = 0;
	
	for (int i = 100; i <= 200; i+=2) {
		soma+=i;
	}
	System.out.print("A soma dos números pares de 100 a 200 é: "+ soma);
	}

}

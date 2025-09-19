package bloco8_3;

public class exercicio13 {

	public static void main(String[] args) {
		// Número primo é aquele que só	é divisível por	ele	mesmo e por	1. Faça um programa	que	determine e	escreva	os números primos compreendidos	entre 100 e	1000.
		int controle=0;
		
		System.out.println("Os números primos entre 100 e 1000 são: ");
		
		for (int i= 101; i <= 1000; i+=2) {
			controle=0;
	
				for (int d= 2; d <= 1000; d++) {
					if (i % d == 0) {
						controle++;
					}
				}
				if(controle == 1) {
					System.out.println(i);
				}

		}

	}

}

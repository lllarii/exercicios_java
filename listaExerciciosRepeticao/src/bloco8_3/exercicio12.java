package bloco8_3;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// Faça um programa	para ler a altura e o sexo (feminino, masculino) de 10 pessoas. Calcular e escrever: a maior e a menor altura; a média de altura das mulheres; o número	de homens
		
	Scanner entrada = new Scanner(System.in);
	double media;
	int mulheres=0, homens=0, altura, menorA=0, maiorA=0, soma=0;
	char sexo;
	
	System.out.println("**Cadastro de informações**");
	
	for (int i= 1; i <= 10; i++) {
			
		System.out.println("Digite a altura da "+ i + "ª pessoa em cm: ");
		altura = entrada.nextInt();
		
		System.out.println("Digite o gênero da "+ i + "ª pessoa. Selecione: ");
		System.out.println("1- mulher");
		System.out.println("2- homem");
		sexo = entrada.next().charAt(0);
		
		if(sexo == '2') {
			homens++;
		};
		
		if(sexo == '1') {
			mulheres++;
			soma = soma + altura;
		};
		
		if(altura> maiorA) {
			maiorA = altura;
		};
		
		if(i == 1) {
			menorA= altura;
		};
		
		if(altura< menorA) {
			menorA= altura;
		};
		
	};
	
	System.out.println("A maior altura registrada é: "+ maiorA);
	System.out.println("A menor altura registrada é: "+ menorA);
	
	if (mulheres != 0) {
		media = soma/mulheres;
		System.out.println("A média de altura das mulheres é: "+ media);
	}
	else {
		System.out.println("Nenhuma mulher foi registrada neste programa. Assim, não é possível exibir a média de altura");
	};
	
	if (homens != 0) {
		System.out.println("O número de homens é: "+ homens);
	}
	else {
		System.out.println("Nenhum homem foi registrado neste programa. Assim, o número é 0.");
	}

	}

}

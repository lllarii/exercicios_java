package exerciciosLoops;
import java.util.Scanner;
 
public class ExDoWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		double media;
		
		do {
			System.out.println("Digite a primeira nota: ");
			n1= entrada.nextInt();
			
			if(n1<0 || n1>10) {
				System.out.println("Nota inválida.");
			}
		}while(n1<0 || n1>10);
		
					
		do {
			System.out.println("Digite a segunda nota: ");
			n2= entrada.nextInt();
			if(n1<0 || n1>10) {
			System.out.println("Nota inválida.");
			}
		}while((n2<0 || n2>10));
		
		media = (n1+n2)/2;
		System.out.println("A média semestral é: "+media);

	}


}
 
	/*VERSAO INICIAL COM IF
	   public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		double media;
		boolean nota;
		
		do {
			System.out.println("Digite a primeira nota: ");
			n1= entrada.nextInt();
			if(n1<0 || n1>10) {
				System.out.println("Nota inválida.");
				nota= false;
			}
			else {
				nota=true;
			}
			
		}while(nota == false);
		
		do {
			System.out.println("Digite a segunda nota: ");
			n2= entrada.nextInt();
			if(n2<0 || n2>10) {
				System.out.println("Nota inválida.");
				nota= false;
			}
			else {
				nota=true;
			}
		}while(nota == false);
		
		media = (n1+n2)/2;
		System.out.println("A média semestral é: "+media);
 
	} */
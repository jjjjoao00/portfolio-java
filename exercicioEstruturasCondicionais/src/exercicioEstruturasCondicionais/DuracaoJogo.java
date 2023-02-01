package exercicioEstruturasCondicionais;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a hora de inicio: ");
		int numA = scan.nextInt();
		System.out.println("Digite a hora de término: ");
		int numB = scan.nextInt();
		
		if (numA >= numB) {
			int duracaoFinal = (24 - numA) + numB;
			System.out.println("O Jogo durou " + duracaoFinal + " Hora(s)");	
		}else if (numB >= numA) {
			int duracaoFinal = numB - numA;
			System.out.println("O Jogo durou " + duracaoFinal + " Hora(s)");	
		}
	}

}

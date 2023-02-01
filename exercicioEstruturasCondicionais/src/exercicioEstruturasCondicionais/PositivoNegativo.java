package exercicioEstruturasCondicionais;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero negativo ou postivo: ");
		int numero = scan.nextInt();
		
		//(numero >= 0) ? System.out.println("Positivo") : System.out.println("Negativo");
		if (numero >= 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		

	}

}

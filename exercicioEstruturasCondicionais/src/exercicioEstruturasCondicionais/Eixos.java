package exercicioEstruturasCondicionais;

import java.util.Scanner;

public class Eixos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma coordenada em x: ");
		double x = scan.nextDouble();
		System.out.println("Digite uma coordenada em y: ");
		double y = scan.nextDouble();
		
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}

	}

}

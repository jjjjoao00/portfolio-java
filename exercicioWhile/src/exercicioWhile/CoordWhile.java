package exercicioWhile;

import java.util.Scanner;

public class CoordWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a coordenada em X: ");
		double x = scan.nextDouble();
		
		System.out.println("Digite a coordenada em Y: ");
		double y = scan.nextDouble();
		
		
		
		while(x != 0 && y != 0 ) {
			 if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			}else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			}else {
				System.out.println("Quarto");
			}
			x = scan.nextDouble();
			y = scan.nextDouble();
			
		}
		scan.close();
	}

}

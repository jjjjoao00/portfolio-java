package exercicioEstruturasCondicionais;

import java.util.Scanner;

public class Intevalo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numA = scan.nextDouble();
		//System.out.println("Quantidade");
		//double numB = scan.nextInt();
		
		
		if (numA >= 0 && numA <= 25) {
			System.out.println("Intervalo [0,25]");
			
		}else if (numA >= 25 && numA <= 50) {
			System.out.println("Intervalo [25,50]");
			
		}else if (numA >= 50 && numA <= 75) {
			System.out.println("Intervalo [50,75]");
			
		}else if (numA >= 75 && numA <= 100) {
			System.out.println("Intervalo [75,100]");	
		}else {
			System.out.println("Fora do intervalo");
		}
			
	
		

	}

}

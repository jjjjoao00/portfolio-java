package exercicioEstruturasCondicionais;

import java.util.Scanner;

public class ContaPagar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Código");
		int numA = scan.nextInt();
		System.out.println("Quantidade");
		double numB = scan.nextInt();
		
		switch (numA) {
		case 1:
			double valorPago = numB * 4.00;
			System.out.printf("Total: R$ %.2f%n", valorPago);
			break;
		
		case 2:
			double valorPago2 = numB * 4.50;
			System.out.printf("Total: R$ %.2f%n", valorPago2);
			break;
		
		case 3:
			double valorPago3 = numB * 5.00;
			System.out.printf("Total: R$ %.2f%n", valorPago3);
			break;
		
		case 4:
			double valorPago4 = numB * 2.00;
			System.out.printf("Total: R$ %.2f%n", valorPago4);
			break;
		
		case 5:
			double valorPago5 = numB * 1.50;
			System.out.printf("Total: R$ %.2f%n", valorPago5);
			break;
			
		default:
			System.out.println("Digite um código válido");	
		}
		

	}

}

package exercicioEstruturasCondicionais;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int numA = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numB = scan.nextInt();
		
		if(numA > numB && numA % numB == 0) {
			System.out.println("Multiplo");
		}else if (numA < numB && numB % numA == 0) {
			System.out.println("Multiplo");  
		}else {
			System.out.println("Não é multiplo");
		}
		
		

	}

}

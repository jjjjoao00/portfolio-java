package exercicioWhile;

import java.util.Scanner;

public class PostoGasolinaWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o código");
		int codigo = scan.nextInt();
		int alcool= 0;
		int gasolina=0;
		int diesel=0;
		
		while (codigo != 4) {
			if (codigo == 1) {
				alcool ++;
			}else if (codigo == 2) {
				gasolina ++;
			}else if (codigo == 3) {
				diesel ++;
			}
			codigo = scan.nextInt();
			
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scan.close();
		
		

	}

}

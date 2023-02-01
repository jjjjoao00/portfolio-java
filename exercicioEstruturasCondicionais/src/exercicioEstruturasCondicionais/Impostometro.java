package exercicioEstruturasCondicionais;

import java.util.Scanner;

public class Impostometro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		double salario = scan.nextDouble();
		//System.out.println("Digite uma coordenada em y: ");
		//double y = scan.nextDouble();
		
		
		if(salario >= 2000.01 && salario <= 3000) {
			double imposto = (8*salario)/100;
			System.out.println(imposto); 	
		}else if(salario >= 3000.01 && salario <= 4500) {
			double imposto = (18*salario)/100;
			System.out.println(imposto); 	
		}else if(salario > 4500) {
			double imposto = (28*salario)/100;
			System.out.println(imposto); 	
		}
		
		
		
		

	}

}

package exercicioWhile;

import java.util.Scanner;

public class SenhaWhile {

	public static void main(String[] args) {
		
		System.out.println("Digite uma Senha: ");
		
		
		Scanner scan = new Scanner(System.in);
		int tentaSenha = scan.nextInt();
		
		while (tentaSenha != 2002) {
			System.out.println("Senha Invalida");
			tentaSenha = scan.nextInt();
		}System.out.println("Acesso Permitido");
		
		
	  
		
		scan.close();

	}

}

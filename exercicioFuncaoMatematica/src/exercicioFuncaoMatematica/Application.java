package exercicioFuncaoMatematica;

import metodos.Areas;
import metodos.Diferenca;
import metodos.NumeroHoraSalario;
import metodos.Raio;
import metodos.Soma;
import metodos.ValorPagar;

public class Application {

	public static void main(String[] args) {
		Soma soma = new Soma();
		Areas area = new Areas();
		Diferenca dif = new Diferenca();
		NumeroHoraSalario nhs = new NumeroHoraSalario();
		ValorPagar valor = new ValorPagar();
		Raio raio = new Raio();
		
		Raio.AreasABC(3.0, 4.0, 5.2);
		
		//ValorPagar.valorPago(12, 1, 5.30, 12, 2, 5.10);
		
		//NumeroHoraSalario.NumeroSalario(5, 200, 20.50);
		
		//Diferenca.diferenca(5, 6, 7, 8);
		
		//Soma.soma(10, -30);
		
		//Areas.area(2);
		
		
		
		
		

	}

}

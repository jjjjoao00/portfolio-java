package metodos;

public class NumeroHoraSalario {
	private int numero;
	private double horas;
	private double valorHora;
	
	
	public static void NumeroSalario(int numero, double horas, double valorHora) {
		double salario = horas * valorHora;
		System.out.println("Numero = " + numero);
		System.out.print("Salario = R$ ");
		System.out.printf("%.2f%n",salario);
	}
}

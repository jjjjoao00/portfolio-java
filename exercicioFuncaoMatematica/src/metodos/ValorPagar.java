package metodos;

public class ValorPagar {
	
	private int codigo1;
	private int numeroPecas1;
	private double valorUnitario1;
	
	
	private int codigo2;
	private int numeroPecas2;
	private double valorUnitario2;
	
	public static void valorPago(int codigo1, int numeroPecas1, double valorUnitario1, int codigo2, int numeroPecas2, double valorUnitario2) {
		double valorFinal = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);
		System.out.println("VALOR A PAGAR: R$ " + valorFinal);
	}

}

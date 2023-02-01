package metodos;
import java.lang.Math;

public class Raio {
	private double numA;
	private double numB;
	private double numC;
	
	
	public static void AreasABC(double numA, double numB, double numC) {
		double areaTrianguloRetangulo = (numA * numC)/ 2;
		double areaCirculo = numC * Math.PI;
		double areaTrapezio = ((numA + numB) * numC)/2;
		double areaQuadrado = numB * numB;
		double areaRetangulo = numA * numB;
		
		System.out.printf("Triangulo: %.3f%n" , areaTrianguloRetangulo);
		System.out.printf("Trapezio: %.3f%n" ,areaTrapezio);
		System.out.printf("Circulo: %.3f%n" , areaCirculo);
		System.out.printf("Quadrado: %.3f%n" , areaQuadrado);
		System.out.printf("Retangulo: %.3f%n" ,areaRetangulo);
	}
	
	

}

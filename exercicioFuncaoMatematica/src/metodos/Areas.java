package metodos;
import java.lang.Math;
import java.util.Locale;


public class Areas {
	private double raio;
	
	public static void area (double raio){
		Locale.setDefault(Locale.US);
		double area  = Math.PI * Math.pow(raio, 2);
		System.out.printf("%.4f%n",  area);
		
	}
	
	

}

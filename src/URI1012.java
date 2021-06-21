import java.util.Locale;
import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double Vr1, Vr2, Vr3, pi, aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo;
		
		Vr1 = sc.nextDouble();
		Vr2 = sc.nextDouble();
		Vr3 = sc.nextDouble();
		
		pi = 3.14159;
		
		aTriangulo = Vr1 * Vr3 / 2.0;
		aCirculo = pi * Vr3 * Vr3;
		aTrapezio = (Vr1 + Vr2) / 2 * Vr3;
		aQuadrado = Vr2 * Vr2;
		aRetangulo = Vr1 * Vr2;
		
		System.out.printf("TRIÂNGULO: %.3f%n", aTriangulo);
		System.out.printf("CIRCULO: %.3f%n", aCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", aTrapezio);
		System.out.printf("QUADRADO: %.3f%n", aQuadrado);
		System.out.printf("RETANGULO: %.3f%n", aRetangulo);
		
		sc.close();
	}

}

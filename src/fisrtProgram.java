import java.util.Locale;

public class fisrtProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Olá Java! ");
		System.out.println("Sextou");
		System.out.println("-----------");
		
		int y = 32;
		System.out.println(y);
		System.out.println("-----------");
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("-----------");
		
		System.out.printf("%.4f%n", x);
		System.out.println("-----------");
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.println("-----------");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.println("-----------");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f%n", nome, idade, renda);
		
	}

}

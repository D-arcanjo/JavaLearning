import java.util.Locale;
import java.util.Scanner;

public class saidaDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você escreveu: " + x);
		System.out.println("------------");
		
		
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y + " anos");
		System.out.println("------------");
		
		
		
		double z;
		z = sc.nextDouble();
		System.out.printf("Agora você digitou: %.4f%n", z);
		System.out.println("------------");
		
		
		
		char w;
		w = sc.next().charAt(3);
		System.out.println("A quarta letra é " + w);
		System.out.println("------------");
		
		
		
		int a;
		String s1, s2, s3;
		
		a = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(a);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("------------");
		
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old,  code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		System.out.printf("US decimal point: %.3f%n", measure);
		
		sc.close();
	}

}

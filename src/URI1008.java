import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double valorHora, salario;
		num = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = horas * valorHora;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}

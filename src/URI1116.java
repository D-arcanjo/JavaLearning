import java.util.Locale;
import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if (num2 != 0) {
				double divisao = (double) num1 / num2;
				System.out.println(divisao);
			}
			else {
				System.out.println("divisao impossivel");
			}
			
		}
		
		sc.close();
	}

}

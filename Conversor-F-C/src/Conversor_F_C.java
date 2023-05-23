import java.util.Scanner;

public class Conversor_F_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO NOSSO CONVERSOR DE TEMPERATURA");
		
		double C, F;
		
		System.out.println("INFORME GRAUS EM CELSIUS: ");
		C = scanner.nextDouble();
		
		F = (C * 1.8 + 32);
		
		System.out.println("Fahrenheit = " + F);
	

	}

}

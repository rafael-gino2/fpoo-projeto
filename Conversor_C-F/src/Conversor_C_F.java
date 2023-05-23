import java.util.Scanner;

public class Conversor_C_F {
	public static void main(String[] args) {
		
		System.out.println("BEM VINDO AO NOSSO CONVERSOR DE TEMPERATURA");
		Scanner scanner = new Scanner(System.in);
		
		double C, F;
		
		System.out.println("INFORME GRAUS EM FAHRENHEIT: ");
		F = scanner.nextDouble();
		
		C = (F-32)/1.8;
		
		System.out.println("Fahrenheit = " + C);
	
		}
	}

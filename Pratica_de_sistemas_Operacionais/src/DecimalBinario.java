import java.util.Scanner;

public class DecimalBinario {
	
	public static void main(String[] args) {
	    	
	Scanner Scanner = new Scanner(System.in);
	int decimal;
	String binario;    	
	
	System.out.println("DIGITE UM VALOR DECIMAL: ");
	decimal = Scanner.nextInt();
	    	
	binario = Integer.toBinaryString(decimal);
	
	System.out.println("NUMERO DECIMAL: " + decimal);
	System.out.println("RESULTADO EM BINÁRIO: " + binario);
	        
	}
}
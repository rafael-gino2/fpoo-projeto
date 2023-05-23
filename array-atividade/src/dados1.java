import java.util.Scanner;
public class dados1 {

	String[] Nome = new String[10];
	Scanner objScanner = new Scanner(System.in);
	
	
	public void listarNomes() {
		
		for (int indice = 0; indice < Nome.length; indice++) {
			System.out.println(" DIGITE O " + (indice + 1) + "  NOME: ");
			Nome[indice] = objScanner.next();
			}
		System.out.println("LISTAGEM DE NOMES: ");
		int indice = 0;
		while(indice < Nome.length) {
			
		System.out.println((indice + 1 )+ " NOME: " + Nome[indice]);
		indice++;
		}
	
	}
}



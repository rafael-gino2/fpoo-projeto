
public class Pratica_de_sistemas_Operacionais {

	public static void main(String[] args) {
	
	int month = 4;
	String monthString;
	switch (month) {
	
	case 1: monthString = "Nome do sistema operacional: " + System.getProperty("os.name");
	break;
	case 2: monthString = "Arquitetura do Sistema Operacional: " + System.getProperty("os.arch");
	break;
	case 3: monthString = "Versão do Sistema operacional: " + System.getProperty("os.version");
	break;
	case 4: monthString = "Separador de arquivos do Sistema: " + System.getProperty("file.separator");
	break;
	case 5: monthString = "separador de linha: " + System.getProperty("line.separator");
	break;
	case 6: monthString = "Home do usuario: " + System.getProperty("user.home");
	break;
	case 7: monthString = "Nome do sistema operacional: " + System.getProperty("user.dir");
	break;
	default: monthString = "invalid code";
	break;
	}
	System.out.println(monthString);
	
	}
} 	


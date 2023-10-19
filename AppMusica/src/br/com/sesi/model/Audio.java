	package br.com.sesi.model;
	import java.util.Scanner;

	public class Audio extends Musica {
		
		public static void Reproduzir() {
			
			 Scanner scanner = new Scanner(System.in);
			 Audio audios = new Audio();
			
			 System.out.println("Selecione uma música: ");
		     System.out.println("1- Goosebumps");
		     System.out.println("2- Fair Trade");
		     
		    int escolha = scanner.nextInt();
		    
		    if (escolha == 1) {
		    	
		    	audios.setTitulo("Goosebumps");
				audios.setGenero("RAP");
				audios.setArtista("Travis Scott");
				audios.setDuracao(4.03);
				audios.setTotalDeReproducao(2);
				System.out.println("A música Goosebumps de Travis Scott está em reprodução!");
		    	audios.infoAudio();
		    	System.out.println("Tempo escutado: " + audios.TempoDeRepTotal() + " Minutos");
		    	System.out.println("------------------------------------------");
		    	audios.Curtir();
		    	
		    } else {
		    	
		    	audios.setTitulo2("Fair Trade");
				audios.setGenero2("RAP");
				audios.setArtista2("Drake");
				audios.setDuracao2(4.51);
				audios.setTotalDeReproducao2(661);
				System.out.println("Fair Trade de Drake está em reprodução!");
		    	audios.infoAudio2();
		    	System.out.println("Tempo escutado: " + audios.TempoDeRepTotal2() + " Minutos");
		    	System.out.println("------------------------------------------");
		    	audios.Curtir2();
		    }
		    
	
		    
		}

	}


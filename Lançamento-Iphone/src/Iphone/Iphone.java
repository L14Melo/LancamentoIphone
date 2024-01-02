package Iphone;

import Chamadas.Telefone;
import Musica.ReprodutorMusical;
import Navegação.Navegador;

public class Iphone implements Navegador, ReprodutorMusical, Telefone {
	public static void main(String[] args) {
		
	}

	@Override
	public void ligar() {
		System.out.println("Entrando em Ligação ");
		
	}

	public void reproduzirMusica() {
		System.out.println("Entrando em Reprodutor Musical ");
	}


	public void navegar() {
		System.out.println("Entrando navegação ");
		
	}
	
}
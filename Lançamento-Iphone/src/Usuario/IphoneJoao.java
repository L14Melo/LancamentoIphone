
package Usuario;

import Iphone.Iphone;
import Chamadas.Telefone;
import Musica.ReprodutorMusical;
import Navegação.Navegador;

public class IphoneJoao {
	public static void main(String[] args) {
		Iphone iphone = new Iphone ();
		Telefone telefone = iphone;
		ReprodutorMusical reprodutorMusical = iphone;
		Navegador navegador = iphone;
		
		telefone.ligar();
		reprodutorMusical.reproduzirMusica();
		navegador.navegar();
				
	}
}

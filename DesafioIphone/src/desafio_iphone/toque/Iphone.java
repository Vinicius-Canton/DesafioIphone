package desafio_iphone.toque;

import desafio_iphone.internet.NavegadorInternet;
import desafio_iphone.musica.ReprodutorMusical;
import desafio_iphone.telofonico.AparelhoTelefonico;



public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
	//METODOS NAVEGADOR iNTERNET
	@Override
	public void exibePagina(String url) {
		System.out.println("https://" + url);
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
	};
	@Override
	public void atualizarPagina() {
		System.out.println("Página atuaizada");
	};
	
	//METODOS REPRODUTOR MUSICAL
	@Override
	public void pausar() {
		System.out.println("Música pausada");
	}
	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Tocando faixa " + musica);	
	}
	@Override
	public void tocar() {
		System.out.println("Tocando");	
	}
	
	//METODOS APARELHOS TELEFONICOS
	@Override
	public void atender() {
		System.out.println("Atendendo à chamada");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Enviando audio");	
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);		
	}
}
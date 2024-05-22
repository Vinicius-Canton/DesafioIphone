import desafio_iphone.toque.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
		
		iphone.adicionarNovaAba();
		iphone.exibePagina("www.google.com");
		iphone.atualizarPagina();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("3");
		
		iphone.ligar("(99)98765-4321");
		iphone.atender();
		iphone.iniciarCorreioVoz();
    }
}

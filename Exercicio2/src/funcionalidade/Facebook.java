package funcionalidade;

public class Facebook extends RedeSocial {

    // Construtor que chama o construtor da classe abstrata
    public Facebook() {
        super("Facebook");
    }

    @Override
    public void postar(String conteudo) {
        System.out.println("Postou no Facebook: " + conteudo);
    }

    @Override
    public void curtir(String publicacao) {
        System.out.println("Curtiu uma publicação no Facebook: " + publicacao);
    }

    @Override
    public void compartilhar(String conteudo) {
        System.out.println("Compartilhou no Facebook: " + conteudo);
    }
}

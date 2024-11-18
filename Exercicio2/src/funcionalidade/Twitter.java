package funcionalidade;

public class Twitter extends RedeSocial {

    public Twitter() {
        super("Twitter");
    }

    @Override
    public void postar(String conteudo) {
        System.out.println("Tweetou: " + conteudo);
    }

    @Override
    public void curtir(String publicacao) {
        System.out.println("Curtiu um tweet: " + publicacao);
    }

    @Override
    public void compartilhar(String conteudo) {
        System.out.println("Retweetou: " + conteudo);
    }
}
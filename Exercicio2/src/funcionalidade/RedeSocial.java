package funcionalidade;

public abstract class RedeSocial {
    protected String nome;

    public RedeSocial(String nome) {
        this.nome = nome;
    }

    public abstract void postar(String conteudo);
    public abstract void curtir(String publicacao);
    public abstract void compartilhar(String conteudo);
}
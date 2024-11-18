package excecoes;

// Classe de exceção personalizada (Unchecked Exception)
public class RedeSocialNaoEncontradaException extends RuntimeException {
    // Construtor que recebe uma mensagem como argumento
    public RedeSocialNaoEncontradaException(String mensagem) {
        super(mensagem); // Chama o construtor da classe pai (RuntimeException)
    }
}
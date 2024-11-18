package excecoes;

// Classe de exceção personalizada (Checked Exception)
public class LimiteDePostsException extends Exception {
    // Construtor que recebe uma mensagem como argumento
    public LimiteDePostsException(String mensagem) {
        super(mensagem); // Chama o construtor da classe pai (Exception)
    }
}
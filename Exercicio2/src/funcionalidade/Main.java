package funcionalidade;

import excecoes.LimiteDePostsException;

public class Main {
    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario("João");

            // Adiciona redes sociais
            usuario.adicionarRedeSocial(new Facebook());
            usuario.adicionarRedeSocial(new Twitter());

            // Usa redes sociais
            usuario.usarRedesSociais();

            // Teste de limite de posts
            usuario.verificarLimiteDePosts(6);
        } catch (LimiteDePostsException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
package funcionalidade;

import excecoes.LimiteDePostsException;
import excecoes.RedeSocialNaoEncontradaException;

import java.util.HashSet;

public class Usuario {
    private String nome;
    private HashSet<RedeSocial> redesSociais;

    public Usuario(String nome) {
        this.nome = nome;
        this.redesSociais = new HashSet<>();
    }

    public void adicionarRedeSocial(RedeSocial rede) {
        redesSociais.add(rede);
    }

    public void usarRedesSociais() {
        for (RedeSocial rede : redesSociais) {
            try {
                if (rede instanceof Facebook) {
                    rede.postar("Foto de férias!");
                    rede.curtir("Foto de um amigo!");
                    rede.compartilhar("Notícia importante!");
                } else if (rede instanceof Twitter) {
                    rede.postar("Hoje está um dia incrível!");
                    rede.curtir("Tweet de um influenciador!");
                    rede.compartilhar("Thread interessante!");
                }
            } catch (Exception e) {
                System.out.println("Erro ao usar a rede social: " + e.getMessage());
            }
        }
    }

    public void verificarLimiteDePosts(int posts) throws LimiteDePostsException {
        if (posts > 5) {
            throw new LimiteDePostsException("Você atingiu o limite de posts diários!");
        }
    }

    public void removerRedeSocial(String nome) {
        boolean encontrado = redesSociais.removeIf(rede -> rede.nome.equals(nome));
        if (!encontrado) {
            throw new RedeSocialNaoEncontradaException("Rede social " + nome + " não encontrada!");
        }
    }
}

package br.com.clairtonluz.layoutexample.model;

/**
 * Created by clairton on 23/05/16.
 */
public class Pessoa {

    private String nome;
    private int imagem;

    public Pessoa(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

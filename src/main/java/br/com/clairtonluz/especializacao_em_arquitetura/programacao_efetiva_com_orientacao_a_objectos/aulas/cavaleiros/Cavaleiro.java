package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros;

import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.Poder;

public abstract class Cavaleiro {
	private String nome;
	private String tipo;
	private Poder poderForte;
	private Poder poderFraco;

	public Cavaleiro(String nome, String tipo, Poder poderForte,
			Poder poderFraco) {
		this.nome = nome;
		this.tipo = tipo;
		this.poderForte = poderForte;
		this.poderFraco = poderFraco;
	}

	public void dispararPoderForte() {
		poderForte.disparar();
	}

	public void dispararPoderFraco() {
		poderFraco.disparar();
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

}

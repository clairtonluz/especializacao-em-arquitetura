package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio3;

public class BookRental extends Rental {
	private String author;

	@Override
	public double getTaxa() {
		return 1.2;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

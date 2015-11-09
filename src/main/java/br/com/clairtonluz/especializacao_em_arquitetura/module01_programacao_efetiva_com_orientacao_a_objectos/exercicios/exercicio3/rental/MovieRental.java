package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio3.rental;



public class MovieRental extends Rental {

	private int classification;

	@Override
	public double getTaxa() {
		return 1.3;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}
}

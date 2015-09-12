package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio3;



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

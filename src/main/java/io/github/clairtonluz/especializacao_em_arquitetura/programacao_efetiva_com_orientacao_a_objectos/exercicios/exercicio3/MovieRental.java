package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio3;

import java.util.Date;


public class MovieRental {

	private String movieTitle; 
	private int classification;
	private Date rentDate;
	private Date dueDate;
	private double rentalFee;
	
	public boolean isOverdue() {
		Date now = new Date();
		return dueDate.before(now);
	}
	
	public double getTotalFee() {
		return isOverdue() ? 1.2*rentalFee : rentalFee;
	}
}

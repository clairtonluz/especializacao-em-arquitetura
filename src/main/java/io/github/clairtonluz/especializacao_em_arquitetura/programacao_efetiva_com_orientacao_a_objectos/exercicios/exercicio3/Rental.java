package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio3;

import java.util.Date;

public abstract class Rental {
	private String title;
	private Date rentDate;
	private Date dueDate;
	private double rentalFee;

	public boolean isOverdue() {
		Date now = new Date();
		return dueDate.before(now);
	}

	public double getTotalFee() {
		return isOverdue() ? getTaxa() * rentalFee : rentalFee;
	}

	public abstract double getTaxa();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public double getRentalFee() {
		return rentalFee;
	}

	public void setRentalFee(double rentalFee) {
		this.rentalFee = rentalFee;
	}

}

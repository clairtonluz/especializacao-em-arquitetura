package br.gov.fa7.cursoejb.exercicio3;

import javax.ejb.Stateless;

@Stateless(name = "Multiplicacao")
public class Multiplicacao implements Operador {

	@Override
	public double perform(double op1, double op2) {
		return op1 * op2;
	}

	@Override
	public char getOperation() {
		return '*';
	}

}

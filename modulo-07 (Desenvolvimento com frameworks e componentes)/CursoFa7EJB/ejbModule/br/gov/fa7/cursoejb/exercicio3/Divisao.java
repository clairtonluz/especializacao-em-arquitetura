package br.gov.fa7.cursoejb.exercicio3;

import javax.ejb.Stateless;

@Stateless(name = "Divisao")
public class Divisao implements Operador {

	@Override
	public double perform(double op1, double op2) {
		return op1 / op2;
	}

	@Override
	public char getOperation() {
		return '/';
	}

}

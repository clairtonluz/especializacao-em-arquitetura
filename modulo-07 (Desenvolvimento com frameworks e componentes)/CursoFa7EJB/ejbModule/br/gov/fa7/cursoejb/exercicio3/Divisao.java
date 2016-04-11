package br.gov.fa7.cursoejb.exercicio3;

import javax.ejb.Stateless;

@Stateless(name = "Divisao")
public class Divisao implements Operador {

	@Override
	public double perform(double op1, double op2) {
		if(op2 == 0) throw new ArithmeticException("Divisão por 0(Zero) não é permitida"); 
		return op1 / op2;
	}

	@Override
	public char getOperation() {
		return '/';
	}

}

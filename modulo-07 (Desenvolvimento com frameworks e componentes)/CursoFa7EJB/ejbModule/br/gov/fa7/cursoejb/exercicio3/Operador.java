package br.gov.fa7.cursoejb.exercicio3;

import javax.ejb.Local;

@Local
public interface Operador {
	double perform(double op1, double op2);

	char getOperation();
}

package br.gov.fa7.cursoejb.exercicio2;

import javax.ejb.Remote;

@Remote
public interface CalculatorController {
	double performOperation(double operand1, double operando2, char operation);
}

package br.gov.fa7.cursoejb.exercicio2;

import javax.ejb.Stateless;

@Stateless(name="CalculatorController")
public class CalculatorControllerImpl implements CalculatorController {

	@Override
	public double performOperation(double operand1, double operand2, char operation) {
		double result;
		switch (operation) {
		case '+':
			result = operand1 + operand2;
			break;

		case '-':
			result = operand1 - operand2;
			break;

		case '*':
			result = operand1 * operand2;
			break;

		case '/':
			result = operand1 / operand2;
			break;

		default:
			throw new IllegalArgumentException("Operador inválido");
		}
		return result;
	}

}

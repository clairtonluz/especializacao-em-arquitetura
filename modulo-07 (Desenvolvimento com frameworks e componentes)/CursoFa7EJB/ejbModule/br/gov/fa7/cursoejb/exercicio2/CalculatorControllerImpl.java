package br.gov.fa7.cursoejb.exercicio2;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.gov.fa7.cursoejb.exercicio3.Operador;
import br.gov.fa7.cursoejb.exercicio4.InvalidOperationException;

@Stateless(name="CalculatorController")
public class CalculatorControllerImpl implements CalculatorController {
	
	@EJB(beanName="Soma")
	private Operador soma;
	@EJB(beanName="Subtracao")
	private Operador subtracao;
	@EJB(beanName="Multiplicacao")
	private Operador multiplicacao;
	@EJB(beanName="Divisao")
	private Operador divisao;
	private Map<Character, Operador> map = new HashMap<Character, Operador>();
	
	@PostConstruct
	public void init(){
		map.put('+', soma);
		map.put('-', subtracao);
		map.put('*', multiplicacao);
		map.put('/', divisao);
	}

	@Override
	public double performOperation(double op1, double op2, char operation) {
		if(map.get(operation) == null) throw new InvalidOperationException("Operação inválida");
		return ((Operador) map.get(operation)).perform(op1, op2);
	}

}

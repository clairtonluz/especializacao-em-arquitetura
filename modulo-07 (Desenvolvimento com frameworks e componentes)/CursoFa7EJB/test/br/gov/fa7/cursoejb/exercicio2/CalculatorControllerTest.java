package br.gov.fa7.cursoejb.exercicio2;

import static org.junit.Assert.assertEquals;

import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import br.gov.fa7.cursoejb.exercicio1.JNDIUtils;

public class CalculatorControllerTest {

	private CalculatorController calculatorController;

	@Before
	public void setup() throws NamingException {
		calculatorController = JNDIUtils.lookup(
				"CursoFa7/CursoFa7EJB/CalculatorController!br.gov.fa7.cursoejb.exercicio2.CalculatorController");
	}

	@Test
	public void testSoma() throws NamingException {
		double result = calculatorController.performOperation(10, 10, '+');
		assertEquals(20, result, 0d);
	}

	@Test
	public void testSubtracao() throws NamingException {
		double result = calculatorController.performOperation(10, 10, '-');
		assertEquals(0, result, 0d);
	}

	@Test
	public void testMultiplicacao() throws NamingException {
		double result = calculatorController.performOperation(10, 10, '*');
		assertEquals(100, result, 0d);

	}

	@Test
	public void testDivisao() throws NamingException {
		double result = calculatorController.performOperation(10, 10, '/');
		assertEquals(1, result, 0d);

	}

}

package br.gov.fa7.cursoejb.exercicio1;

import static org.junit.Assert.assertEquals;

import javax.naming.NamingException;

import org.junit.Test;

public class EchoServiceTest {

	@Test
	public void testEcho() throws NamingException {
		EchoService echoService = JNDIUtils
				.lookup("CursoFa7/CursoFa7EJB/EchoService!br.gov.fa7.cursoejb.exercicio1.EchoService");
		
		String expected = "hello";
		String echo = echoService.echo(expected);
		assertEquals(expected, echo);
	}

}

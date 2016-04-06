package br.gov.fa7.cursoejb.exercicio1;

import javax.ejb.Remote;

@Remote
public interface EchoService {
	
	String echo(String text);
	
}

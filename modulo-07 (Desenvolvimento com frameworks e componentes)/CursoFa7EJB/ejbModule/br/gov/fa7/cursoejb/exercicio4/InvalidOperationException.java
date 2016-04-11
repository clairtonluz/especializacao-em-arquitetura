package br.gov.fa7.cursoejb.exercicio4;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class InvalidOperationException extends RuntimeException {
	
	public InvalidOperationException(String msg) {
		super(msg);
	}

}

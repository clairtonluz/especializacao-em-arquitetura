package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio4;

public class NumeroCartela {
	private Integer numero;
	private boolean marcar;
	
	public NumeroCartela(Integer numero) {
		this.numero = numero;
	}

	public boolean isMarcar() {
		return marcar;
	}

	public void setMarcar(boolean marcar) {
		this.marcar = marcar;
	}

	public Integer getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return numero.toString();
	}

}

package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.aulas.robos2;

import br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos.Comportamento;

public class Robo {

	private Comportamento comportamento;

	public Robo(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void atacar() {
		comportamento.atacar();
	}

	public void defender() {
		comportamento.defender();
	}

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

}

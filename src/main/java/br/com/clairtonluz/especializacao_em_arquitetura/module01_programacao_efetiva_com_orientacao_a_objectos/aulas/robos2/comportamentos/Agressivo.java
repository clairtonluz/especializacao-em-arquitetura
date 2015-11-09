package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos;

public class Agressivo implements Comportamento {

	@Override
	public void atacar() {
		System.out.println("Ataque agressivo");
	}

	@Override
	public void defender() {
		System.out.println("Defesa agressivo");
	}

}

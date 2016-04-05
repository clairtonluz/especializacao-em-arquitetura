package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos;

public class Normal implements Comportamento {

	@Override
	public void atacar() {
		System.out.println("Ataque normal");
	}

	@Override
	public void defender() {
		System.out.println("Defesa normal");
	}

}

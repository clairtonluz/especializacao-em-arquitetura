package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos;

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

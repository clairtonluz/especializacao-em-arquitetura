package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos;

public class RoboMicreiro extends Robo {

	@Override
	protected void construir() {
		System.out.println("Micreiro construir");
	}

	@Override
	protected void testar() {
		System.out.println("Micreiro testar");
	}

}

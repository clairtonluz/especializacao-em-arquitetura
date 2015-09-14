package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos;

public class RoboPedreiro extends Robo {

	@Override
	protected void construir() {
		System.out.println("Pedreiro construir");
	}

	@Override
	protected void testar() {
		System.out.println("Pedreiro testar");
	}

}

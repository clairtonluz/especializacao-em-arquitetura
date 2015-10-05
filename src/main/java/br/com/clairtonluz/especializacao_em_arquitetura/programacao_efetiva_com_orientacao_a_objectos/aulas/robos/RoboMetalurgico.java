package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos;

public class RoboMetalurgico extends Robo {

	@Override
	protected void construir() {
		System.out.println("Metalurgico construir");
	}

	@Override
	protected void testar() {
		System.out.println("Metalurgico testar");
	}

}

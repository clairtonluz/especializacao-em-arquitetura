package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos.teste;

import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos.Robo;
import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos.RoboMetalurgico;
import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos.RoboMicreiro;
import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos.RoboPedreiro;

public class TestarRobos {

	public static void main(String[] args) {
		Robo pedreiro = new RoboPedreiro();
		Robo micreiro = new RoboMicreiro();
		Robo metalurgico = new RoboMetalurgico();
		
		pedreiro.executar();
		micreiro.executar();
		metalurgico.executar();
	}
}

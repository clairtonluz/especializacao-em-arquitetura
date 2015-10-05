package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.teste;

import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.Robo;
import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos.Comportamento;
import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos.Defensivo;
import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos.Normal;
import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.robos2.comportamentos.Agressivo;

public class RoboTest {
	
	public static void main(String[] args) {
		Comportamento agressivo = new Agressivo();
		Robo r = new Robo(agressivo);
		r.atacar();
		r.defender();
		
		r.setComportamento(new Defensivo());
		r.atacar();
		r.defender();
		
		r.setComportamento(new Normal());
		r.atacar();
		r.defender();
	}
}

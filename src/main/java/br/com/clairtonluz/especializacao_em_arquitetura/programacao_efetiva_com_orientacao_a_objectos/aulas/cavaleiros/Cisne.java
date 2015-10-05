package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros;

import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.PoDeDiamante;
import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.TrovaoAurora;

public class Cisne extends Cavaleiro {

	public Cisne() {
		super("Hyoga", "Bronze", new PoDeDiamante(), new TrovaoAurora());
	}
	
	public void dispararPoDeDiamante(){
		dispararPoderForte();
	}
	
	public void dispararTrovaoAurora(){
		dispararPoderFraco();
	}
}

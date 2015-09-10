package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros;

public class Cisne extends Cavaleiro {

	public Cisne() {
		super("Ioga", "Bronze", new PoDeDiamante(), new TrovaoAurora());
	}
	
	public void dispararPoDeDiamante(){
		dispararPoderForte();
	}
	
	public void dispararTrovaoAurora(){
		dispararPoderFraco();
	}
}

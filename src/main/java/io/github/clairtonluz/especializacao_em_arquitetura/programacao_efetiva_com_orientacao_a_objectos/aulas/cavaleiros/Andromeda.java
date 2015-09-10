package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros;

import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.CorrenteDeAndromedra;
import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.NebulosaDeAndromeda;
import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.PoDeDiamante;
import io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.TrovaoAurora;

public class Andromeda extends Cavaleiro {

	public Andromeda() {
		super("Shun", "Bronze", new CorrenteDeAndromedra(), new NebulosaDeAndromeda());
	}
	
	public void dispararCorrenteDeAndromeda(){
		dispararPoderForte();
	}
	
	public void dispararNebulosaDeAndromeda(){
		dispararPoderFraco();
	}
}

package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros;

import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.CorrenteDeAndromedra;
import br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes.NebulosaDeAndromeda;

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

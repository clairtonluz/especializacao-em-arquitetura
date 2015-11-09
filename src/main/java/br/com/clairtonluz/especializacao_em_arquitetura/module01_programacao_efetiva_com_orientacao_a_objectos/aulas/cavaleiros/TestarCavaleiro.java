package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros;

public class TestarCavaleiro {

	public static void main(String[] args) {
		Cisne cisne = new Cisne();
		cisne.dispararPoDeDiamante();
		cisne.dispararTrovaoAurora();
		
		Andromeda andromeda = new Andromeda();
		andromeda.dispararCorrenteDeAndromeda();
		andromeda.dispararNebulosaDeAndromeda();
	}
}

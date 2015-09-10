package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros;

public class PoDeDiamante implements Poder{

	@Override
	public void disparar() {
		System.out.println("Póóóóóóóó de diamanteee!");
	}

	@Override
	public int getDano() {
		return 20;
	}

}

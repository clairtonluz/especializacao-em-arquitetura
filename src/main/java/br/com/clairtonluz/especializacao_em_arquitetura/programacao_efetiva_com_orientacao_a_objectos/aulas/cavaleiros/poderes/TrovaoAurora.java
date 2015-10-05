package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes;


public class TrovaoAurora implements Poder{

	@Override
	public void disparar() {
		System.out.println("Trovãoooo auroraaa!");
	}

	@Override
	public int getDano() {
		return 20;
	}

}

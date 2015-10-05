package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes;

public class NebulosaDeAndromeda implements Poder {

	@Override
	public void disparar() {
		System.out.println("Nebulosa de Andromedaaaa!");

	}

	@Override
	public int getDano() {
		return 20;
	}

}

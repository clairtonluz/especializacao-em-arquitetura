package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas.cavaleiros.poderes;

public class CorrenteDeAndromedra implements Poder {

	@Override
	public void disparar() {
		System.out.println("Correeente de Andromedaaaa!");
	}

	@Override
	public int getDano() {
		return 50;
	}

}

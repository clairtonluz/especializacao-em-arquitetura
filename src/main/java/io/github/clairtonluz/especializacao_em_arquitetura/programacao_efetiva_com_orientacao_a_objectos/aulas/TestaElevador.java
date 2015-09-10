package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas;

public class TestaElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(5, 10);
		
		elevador.entrarPessoa();
		elevador.entrarPessoa();
		elevador.entrarPessoa();
		elevador.entrarPessoa();
		elevador.entrarPessoa();
		elevador.entrarPessoa();
		
		elevador.irPara(5);
		elevador.sairPessoa();
		elevador.sairPessoa();
		elevador.sairPessoa();
		
		elevador.irPara(2);
		elevador.sairPessoa();
		elevador.sairPessoa();
		elevador.sairPessoa();
	}
}

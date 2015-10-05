package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas;

public class UsandoAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno("Clairton Luz", "123456", 'M');
		a.atribuirNota(1, 7);
		a.atribuirNota(2, 8);
		a.atribuirNota(3, 9);
		a.atribuirNota(4, 8);
		
		a.exibir();
	}
}

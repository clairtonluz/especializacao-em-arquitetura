package io.github.clairtonluz.programacao_efetiva_com_orientacao_a_objectos.aula2;
public class Data {

	int dia;
	int mes;
	int ano;

	public Data() {
		this(2015);
	}

	public Data(int ano) {
		this.ano = ano;
	}

	public void incrementarAno() {
		ano++;
	}

	public void incrementarAno(int n) {
		ano += n;
	}
}

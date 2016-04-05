package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio5.questao1;

public class CharSequenceImpl implements CharSequence {

	private StringBuilder value;
	
	public CharSequenceImpl(String value) {
		super();
		this.value = new StringBuilder(value).reverse();
	}

	@Override
	public int length() {
		return value.length();
	}

	@Override
	public char charAt(int index) {
		return value.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return value.subSequence(start, end);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}

}

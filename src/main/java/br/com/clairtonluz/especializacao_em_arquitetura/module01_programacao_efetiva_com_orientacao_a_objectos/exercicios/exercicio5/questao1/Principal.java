package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio5.questao1;

public class Principal {

	public static void main(String[] args) {
		CharSequenceImpl c = new CharSequenceImpl("Qualquer tecnologia suficientemente avançada é indistinta de magia. - Arthur C. Clarke");
		System.out.println(c.toString());
		System.out.println(c.length());
		System.out.println(c.charAt(10));
		System.out.println(c.subSequence(9, 19));
	}

}

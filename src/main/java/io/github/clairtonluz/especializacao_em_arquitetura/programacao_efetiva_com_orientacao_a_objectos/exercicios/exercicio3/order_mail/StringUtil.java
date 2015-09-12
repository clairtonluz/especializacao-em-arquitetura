package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio3.order_mail;

public abstract class StringUtil {
	public static boolean isSameString(String s1, String s2) {
		if (s1 == s2) {
			return true;
		}
		if (s1 == null) {
			return false;
		}
		return (s1.equals(s2));
	}
}

package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.List;


public class Globo {
	private List<Integer> bolinhas;
	
	Globo(){
		bolinhas = new ArrayList<Integer>();
		for(int i=1; i<100; i++){
			bolinhas.add(i);
		}
	}
	
	public Integer pegarBolinha(){
		int i = (int) (Math.random()*bolinhas.size());		
		return bolinhas.remove(i);
	}

}

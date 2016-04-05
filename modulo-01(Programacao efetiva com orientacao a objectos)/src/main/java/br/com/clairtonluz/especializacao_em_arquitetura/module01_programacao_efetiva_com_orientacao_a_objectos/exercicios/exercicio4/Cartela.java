package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cartela {
	private int id;
	private List<NumeroCartela> numeros;
	
	Cartela(int id){
		this.id = id;
		numeros = new ArrayList<NumeroCartela>();
		while (20 > numeros.size()){	
			boolean numeroExiste = false;
			int numero = (int) (Math.random()*99)+1;
			for(NumeroCartela n : numeros){
				if(numero==n.getNumero()){
					numeroExiste=true;
					break;
				}
			}
			if(!numeroExiste){
				numeros.add(new NumeroCartela(numero));
			}
			ordenar();
		}
		
	}
	
	private void ordenar(){
		numeros.sort(new Comparator<NumeroCartela>() {

			@Override
			public int compare(NumeroCartela o1, NumeroCartela o2) {
				return o1.getNumero().compareTo(o2.getNumero());
			}
		});
	}

	public int getId() {
		return id;
	}

	public List<NumeroCartela> getNumeros() {
		return numeros;
	}

	public void marcar(Integer bolaSorteada) {
		for (NumeroCartela numeroCartela: numeros){
			if(numeroCartela.getNumero()==bolaSorteada){
				numeroCartela.setMarcar(true);
			}
		}
	}
	
	public boolean isBingo(){
		for(NumeroCartela numeroCartela: numeros){
			if(!numeroCartela.isMarcar()){
				return false;
			}
		}
		return true;
	}

}

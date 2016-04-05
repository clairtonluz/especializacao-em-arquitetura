package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Bingo {
	private Globo globo;
	private List<Cartela> cartelas;
	private List<Cartela> cartelasGanhadoras;
	private List<Integer> numerosSorteados;
	
	Bingo (int qtdCartelas){
		globo = new Globo();
		cartelas = new ArrayList<Cartela>();
		cartelasGanhadoras = new ArrayList<Cartela>();
		numerosSorteados = new ArrayList<Integer>();
		for (int i = 0; i<qtdCartelas; i++){
			cartelas.add(new Cartela(i+1));
		}
	}
	
	public void rodar(){
		boolean temVencedor = false;
		while (!temVencedor) {
			marcar(globo.pegarBolinha());
			temVencedor = verificarGanhador();
		}
		
		System.out.println("#############################################################");
		
		ordernar();
		System.out.println("N�meros Sorteados: " + numerosSorteados);
		System.out.println("Quantidade de ganhadores:" + cartelasGanhadoras.size());
		System.out.println("#############################################################");
		System.out.println("Ganhadores:");

		for(Cartela cartela: cartelasGanhadoras){
			System.out.println("Id da cartela: " + cartela.getId());
			System.out.println("Numeros da cartela: " + cartela.getNumeros().toString());
			System.out.println("#############################################################");
		}
		
	}

	private void ordernar() {
		numerosSorteados.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
	}

	private boolean verificarGanhador() {
		for(Cartela cartela: cartelas){
			if(cartela.isBingo()){
				cartelasGanhadoras.add(cartela);
			}
		}
		return cartelasGanhadoras.size()>0;
	}

	private void marcar(Integer bolinhaSorteada) {
		numerosSorteados.add(bolinhaSorteada);
		for(Cartela cartela: cartelas){
			cartela.marcar(bolinhaSorteada);
		}
	}

}

package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.aulas.robos;

public abstract class Robo {

	protected void inicializar() {
		System.out.println("inicializar...");
	}
	
	protected abstract void construir();
	
	protected abstract void testar();
	
	protected void parar() {
		System.out.println("parar...");
	}
	
	public final void executar() {
		inicializar();
		construir();
		testar();
		parar();
	}
	
}

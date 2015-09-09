package io.github.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas;

public class Elevador {
	private int capacidade;
	private int quantidadeAndares;
	private int andarAtual;
	private int lotacao;
	private boolean portaAberta;

	public Elevador(int capacidade, int quantidadeAndares) {
		this.capacidade = capacidade;
		this.quantidadeAndares = quantidadeAndares;
	}

	public void irPara(int destino) {
		this.andarAtual = destino;
	}

	public void abrirPorta() {
		portaAberta = true;
	}

	public void fecharPorta() {
		portaAberta = false;
	}

	public boolean estaCheio() {
		return lotacao == capacidade;
	}

	public boolean estaVazio() {
		return lotacao == 0;
	}

	public void entrarPessoa() {
		lotacao++;
	}

	public void sairPessoa() {
		lotacao--;
	}

	// GETTERS AND SETTERS
	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidadeAndares() {
		return quantidadeAndares;
	}

	public void setQuantidadeAndares(int quantidadeAndares) {
		this.quantidadeAndares = quantidadeAndares;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}

	public boolean isPortaAberta() {
		return portaAberta;
	}

	public void setPortaAberta(boolean portaAberta) {
		this.portaAberta = portaAberta;
	}
}

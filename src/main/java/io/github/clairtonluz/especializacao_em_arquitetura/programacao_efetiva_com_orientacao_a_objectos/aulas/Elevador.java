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
		System.out.println("indo para " + destino);
		this.andarAtual = destino;
	}

	public void abrirPorta() {
		System.out.println("abrindo porta");
		portaAberta = true;
	}

	public void fecharPorta() {
		System.out.println("fechando porta");
		portaAberta = false;
	}

	public boolean estaCheio() {
		System.out.println("cheio = " + (lotacao == capacidade));
		return lotacao == capacidade;
	}

	public boolean estaVazio() {
		System.out.println("cheio = " + (lotacao == 0));
		return lotacao == 0;
	}

	public void entrarPessoa() {
		System.out.println("entrando pessoa");
		lotacao++;
	}

	public void sairPessoa() {
		System.out.println("saindo pessoa");
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

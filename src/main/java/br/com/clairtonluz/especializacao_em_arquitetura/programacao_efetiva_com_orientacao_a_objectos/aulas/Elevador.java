package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas;

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
		if (destino >= 0 && destino <= quantidadeAndares) {
			System.out.println("indo para " + destino);
			fecharPorta();
			if (destino > andarAtual) {
				for (; andarAtual < destino; andarAtual++) {
					System.out.println("passando pelo andar " + andarAtual);
				}
			} else {
				for (; andarAtual > destino; andarAtual--) {
					System.out.println("passando pelo andar " + andarAtual);
				}
			}
			System.out.println("chegando ao andar " + andarAtual);
			abrirPorta();
		} else {
			System.err.println("destino inválido");
		}
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
		return lotacao == capacidade;
	}

	public boolean estaVazio() {
		return lotacao == 0;
	}

	public void entrarPessoa() {
		if (!estaCheio()) {
			System.out.println("entrando pessoa");
			lotacao++;
		} else {
			System.err.println("O elevador está lotado");
		}
	}

	public void sairPessoa() {
		if (!estaVazio()) {
			System.out.println("saindo pessoa");
			lotacao--;
		} else {
			System.err.println("O elevador está vazio");
		}
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

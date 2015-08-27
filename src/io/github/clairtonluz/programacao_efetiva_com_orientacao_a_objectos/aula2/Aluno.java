package io.github.clairtonluz.programacao_efetiva_com_orientacao_a_objectos.aula2;

public class Aluno {
	private String nome;
	private String matricula;
	private char sexo;
	private String curso;
	private double[] notas = new double[4];

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void exibir() {
		System.out.println(this);
	}

	public void atribuirNota(int numProva, double nota) {
		if (numProva > 0 && numProva <= 4) {
			notas[numProva - 1] = nota;
		} else {
			System.out.println("número da prova deve ser entre 1 e 4");
		}
	}

	public double lerNota(int numProva) {
		return notas[numProva];
	}

	@Override
	public String toString() {
		return nome + ", " + sexo + ", " + matricula + ", " + curso;
	}
}

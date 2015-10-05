package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.aulas;

public class Aluno {
	private String nome;
	private String matricula;
	private char sexo;
	private String curso;
	private double[] notas = new double[4];

	public Aluno() {
		super();
	}

	public Aluno(String nome, char sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}

	public Aluno(String nome, String matricula, char sexo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.sexo = sexo;
	}

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

	public void exibir(String titulo) {
		switch (titulo) {
		case "nome":
			System.out.println(this.nome);
			break;
		case "matricula":
			System.out.println(this.matricula);
			break;
		case "sexo":
			System.out.println(this.sexo);
			break;
		case "curso":
			System.out.println(this.curso);
			break;
		case "notas":
			System.out.println(this.notas);
			break;
		default:
			System.out.println("titulo n�o encontrado");
			break;
		}

	}

	public void atribuirNota(int numProva) {
		this.atribuirNota(numProva, 0);
	}

	public void atribuirNota(int numProva, double nota) {
		if (numProva > 0 && numProva <= 4) {
			notas[numProva - 1] = nota;
		} else {
			System.out.println("n�mero da prova deve ser entre 1 e 4");
		}
	}

	public double lerNota(int numProva) {
		return notas[numProva];
	}

	@Override
	public String toString() {
		return nome + ", " + sexo + ", " + matricula + ", " + curso + ", " + notas[0] + ", " + notas[1] + ", " + notas[2] + ", " + notas[3];
	}
}

public class Data {

	int dia;
	int mes;
	int ano;

	public Data() {
		this(2015);
	}

	public Data(int ano) {
		this.ano = ano;
	}

	public void incrementarAno() {
		ano++;
	}

	public void incrementarAno(int n) {
		ano += n;
	}
}

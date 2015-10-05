package br.com.clairtonluz.especializacao_em_arquitetura.programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio5.questao3;

public class CameraPhone {
	// 2 significa que cada imagem é composta por 2 megapixels
	private int imageSize; 
	private int memorySize; // 4 significa 4 Gigabyes de memória

	public CameraPhone(int imageSize, int memorySize) {
		super();
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}
	
	public int numPictures() {
		return (memorySize * 1000) / imageSize;
	}

	public int getImageSize() {
		return imageSize;
	}

	public int getMemorySize() {
		return memorySize;
	}
	
}

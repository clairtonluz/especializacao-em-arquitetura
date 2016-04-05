package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio5.questao3;

import java.util.Scanner;

public class Inheritance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the imagesize:");
		int imageSize = scanner.nextInt();
		System.out.println("Enter the memorysize:");
		int memorySize = scanner.nextInt();
		
		CameraPhone cph = new CameraPhone(imageSize, memorySize);
		System.out.println("imagesize:"+cph.getImageSize());
		System.out.println("memorysize:"+cph.getMemorySize());
		System.out.println("numPictures:"+cph.numPictures());
	}
}

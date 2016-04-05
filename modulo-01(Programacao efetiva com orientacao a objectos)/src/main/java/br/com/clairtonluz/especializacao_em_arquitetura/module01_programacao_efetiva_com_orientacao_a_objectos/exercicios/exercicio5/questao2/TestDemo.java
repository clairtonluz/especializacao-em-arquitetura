package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio5.questao2;

import java.util.Scanner;

public class TestDemo extends Vehicle {

	public TestDemo(double no) {
		super(no);
	}

	@Override
	public void acelerar() {
		System.out.print(currentSpeed+" ");
		currentSpeed++;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		TestDemo td = new TestDemo(n);
		System.out.println("Current Speed:" + td.getCurrentSpeed());
		System.out.println("Max speed" + td.getMaxSpeed());
		td.pedalToTheMetal();
	}

}

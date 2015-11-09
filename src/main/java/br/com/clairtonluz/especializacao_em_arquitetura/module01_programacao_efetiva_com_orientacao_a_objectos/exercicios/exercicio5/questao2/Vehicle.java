package br.com.clairtonluz.especializacao_em_arquitetura.module01_programacao_efetiva_com_orientacao_a_objectos.exercicios.exercicio5.questao2;

public abstract class Vehicle {
	private double maxSpeed;
	protected double currentSpeed;

	public Vehicle(double maxspeed) {
		super();
		this.maxSpeed = maxspeed;
	}

	public abstract void acelerar();

	public void pedalToTheMetal() {
		while (currentSpeed < maxSpeed) {
			acelerar();
		}
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

}

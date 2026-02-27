package com.sophia.aulapm.lab02;

public class FrequenciaException extends RuntimeException {
	
	private double frequencia;

	public FrequenciaException (double frequencia) {
		this.frequencia = frequencia;
	}

	@Override
	public String toString() {
		return "A frequencia: " + frequencia + "é invalida";
	}
	
	

}


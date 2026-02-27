package com.sophia.aulapm.lab02;

import java.util.Scanner;

public class Aluno {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota;
		double frequencia;
		
		System.out.println("Digite a nota do aluno: ");
		nota = scan.nextDouble();
		System.out.println("Digite a frequencia do aluno: ");
		frequencia = scan.nextDouble();
		
		while(!(verificarEntradaFrequencia(frequencia))){
			frequencia = scan.nextDouble();
		}
		
		verificarEntradaFrequencia(frequencia);
		
		verificarAprovacao(nota, frequencia);
		
	}
	
	static void verificarAprovacao(double nota, double frequencia) {
		if(nota >= 7.0 && frequencia >= 0.75) {
			System.out.println("Aprovado ");
		} else if((nota <= 7.0 && nota >= 4.0) && frequencia > 0.75) {
			System.out.println("Em recuperação ");
		} else {
			System.out.println("Reprovado");
		}	
	}
	
	static boolean verificarEntradaFrequencia(double frequencia) {
		
		if(frequencia > 1 || frequencia < 0) {
			System.out.println("Digite uma frequencia valida ");
			return false;
		}
		return true;
	}
	


}

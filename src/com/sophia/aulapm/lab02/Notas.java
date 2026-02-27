package com.sophia.aulapm.lab02;

import java.util.Scanner;

public class Notas {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] notas = new double[3];
		System.out.println("Digite as 3 notas: ");
		
		for(int i = 0; i<notas.length; i++) {
			notas[i] = scan.nextDouble();
		}
		
		calcularMedia(notas);
		
	}
	
	static void calcularMedia(double[] notas) {
		double somaNotas =0;
		double media = 0;
		for(int i = 0; i<notas.length; i++) {
			somaNotas += notas[i];
		}
		
		media = (somaNotas / 3);
		System.out.println("A media é: " + media);
		
	}
	

}

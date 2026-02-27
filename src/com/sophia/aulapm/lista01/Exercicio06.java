package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] gabarito = new String[8];
		System.out.println(" Digite o gabarito da prova");
		for(int i= 0; i < 8; i++) {
			System.out.println("Gabarito da questão " + (i+1));
			gabarito[i] = sc.nextLine().toUpperCase(); //Para garantir que não haja diferença
		}
		
		String[][] numeroAlunoRespostas = new String[10][9];
		for(int i = 0; i < numeroAlunoRespostas.length; i++) {
			System.out.println("Digite o número do aluno " + (i+1));
			numeroAlunoRespostas[i] = sc.nextLine().toUpperCase();
			for(int j = 0; j < numeroAlunoRespostas[i].length; j++) {
				System.out.println("Digite a resposta " + (j+1) + " do aluno " + i);
				numeroAlunoRespostas[i][j] = sc.nextLine().toUpperCase();
			}
		}
		

	}
	
	public static int confereGabarito(String[] g ,String[][] a) {
		return 
	}
	
	public static void mostraNumeroNota(String[][] a) {
		
	}
	
	public static int porcentagemAprovacao(String[][]) {
		
	}

}

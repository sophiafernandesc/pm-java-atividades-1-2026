package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] mesTemp = new double[12];

		System.out.println("Digite as temperaturas: ");
		for (int i = 1; i < mesTemp.length; i++) {
			System.out.println("Digite a temperatura do mes " + i);
			mesTemp[i] = sc.nextDouble();
		}
	}

	public static double encontraMaiorTemp(double[] a) {
		double maiorTemp = a[1];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > maiorTemp) {
				maiorTemp = a[i];
				return i;
			}
		}
		return maiorTemp;
	}

	public static double encontraMenorTemp(double[] a) {
		double menorTemp = a[1];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < menorTemp) {
				menorTemp = a[i];
				return i;
			}
		}
		return menorTemp;
	}
	
	//metodo para o mes por extenso?
}

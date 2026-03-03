package com.sophia.aulapm.lista01;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] valorObjetos = new double[2];
		int[] qtdObjetos = new int[2];
		
		for( int i = 0; i < valorObjetos.length; i++) {
			for(int j = 0; j < qtdObjetos.length; j++) {
				System.out.println("Digite o valor do objeto " + (i+1) + " :");
				valorObjetos[i] = sc.nextDouble();
				System.out.println("Digite a quantidade vendida desse objeto: ");
				qtdObjetos[i] = sc.nextInt();
			}
		}
		
		int indiceMaisVendido = retornaIndiceMaisVendido(qtdObjetos);
		mostraMaisVendido(indiceMaisVendido, valorObjetos);
		System.out.println("O índice do objeto mais vendido no vetor é: " + indiceMaisVendido);
		
		double totalVendas = calculaValorVendas(valorObjetos);
		System.out.println("O valor total das vendas é: R$" + totalVendas);
	}
	
	public static int retornaIndiceMaisVendido(int[] b) {
		int maiorQtd = b[0];
		int cont = 0;
			for(int i = 0; i < b.length; i++) {
				if(b[i] > maiorQtd) {
					maiorQtd = b[i];
					cont++;
				}
			}
			return cont;	
	}
	
	public static void mostraMaisVendido(int indiceMaisVendido, double[] a){
		for(int i = 0; i < a.length; i++) {
			if(i == indiceMaisVendido) {
				System.out.println("O valor do item mais vendido é: R$"+a[i]);
			}
		}
	}
	
	public static double calculaValorVendas(double[] a) {
		int soma = 0;
		for(int i = 0; i < a.length; i++) {
			soma += a[i];
		}
		return soma;
	}
	
	public static double calculaComissao(double totalVendas) {
		return ((545) + (totalvendas * 0.5));
	}

}

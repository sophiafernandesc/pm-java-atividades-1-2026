package com.sophia.aulapm.lab02;

import java.util.Scanner;

public class Teste {
	
	public static void main(String args[]) {
		
		//Aula lab 02 - Entrada de dados
		Scanner scan= new Scanner(System.in);
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Ola " + nome);
		
		int a, b;
		int soma = 0;
		
		System.out.println("Digite 2 numeros: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma é: " + soma);
		System.out.println(a + " + " + b + " = " + soma );
		
	}

}

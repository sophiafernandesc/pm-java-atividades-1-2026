package com.sophia.aulapm.lab02;

import java.util.Scanner;

public class TestandoException {
	
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double nota;
        double frequencia; // valor invalido para entrar no loop

        System.out.println("Digite a nota do aluno: ");
        nota = scan.nextDouble();

        // Loop para entrada valida
        while (true) {
            try {
                System.out.println("Digite a frequencia do aluno (0.0 a 1.0): ");
                frequencia = scan.nextDouble();
                
                // Tentamos validar. Se falhar, o throw pula direto para o catch!
                validarFrequencia(frequencia);
                
                // Se chegou aqui, a frequência é válida. Saímos do loop.
                break; 
                
            } catch (FrequenciaException e) {
                System.out.println("Tente novamente...");
            } catch (Exception e) {
                
                System.out.println("Entrada inválida! Digite apenas números.");
            }
        }

        verificarAprovacao(nota, frequencia);
        scan.close();
    }
    
    static void verificarAprovacao(double nota, double frequencia) {
        if(nota >= 7.0 && frequencia >= 0.75) {
            System.out.println("Aprovado");
        } else if(nota >= 4.0 && frequencia >= 0.75) { 
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }   
    }

    static void validarFrequencia(double frequencia){
        if(frequencia > 1 || frequencia < 0) {
            throw new FrequenciaException(frequencia);
        }
    }

}

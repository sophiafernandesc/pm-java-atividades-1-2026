package com.sophia.aulapm.lab02;

import java.util.Scanner;

public class TestandoException {
	
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double nota;
        double frequencia; // Inicializamos com valor inválido para entrar no loop

        System.out.println("Digite a nota do aluno: ");
        nota = scan.nextDouble();

        // Loop de repetição para entrada válida
        while (true) {
            try {
                System.out.println("Digite a frequencia do aluno (0.0 a 1.0): ");
                frequencia = scan.nextDouble();
                
                // Tentamos validar. Se falhar, o throw pula direto para o catch!
                validarFrequencia(frequencia);
                
                // Se chegou aqui, a frequência é válida. Saímos do loop.
                break; 
                
            } catch (FrequenciaException e) {
                // Aqui tratamos o SEU erro específico
                //System.out.println(e.getMessage());
                System.out.println("Tente novamente...");
            } catch (Exception e) {
                // Rede de segurança para entradas que não são números
                System.out.println("Entrada inválida! Digite apenas números.");
                scan.next(); // Limpa o buffer do scanner
            }
        }

        verificarAprovacao(nota, frequencia);
        scan.close();
    }
    
    static void verificarAprovacao(double nota, double frequencia) {
        if(nota >= 7.0 && frequencia >= 0.75) {
            System.out.println("Aprovado");
        } else if(nota >= 4.0 && frequencia >= 0.75) { 
            // Dica: Simplifiquei sua lógica de recuperação
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }   
    }
    
    // Agora o método não retorna boolean, ele é um "Guarda"
    static void validarFrequencia(double frequencia){
        if(frequencia > 1 || frequencia < 0) {
            throw new FrequenciaException(frequencia);
        }
    }

}

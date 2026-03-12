package com.sophia.lab04;

import java.util.Scanner;

public class TestePessoa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[10];
        int totalCadastrados = 0; 
        

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\nNova Pessoa (" + (i + 1) + "/10)");
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Sobrenome: ");
            String sobrenome = sc.nextLine();

            if (i > 0) {
                String nomeAtual = nome + sobrenome;
                String nomeAnterior = pessoas[i - 1].getNome() + pessoas[i - 1].getSobrenome();
                
                if (nomeAtual.equalsIgnoreCase(nomeAnterior)) {
                    System.out.println("Nome repetido detectado. Encerrando cadastros...");
                    break;
                }
            }

            System.out.print("Dia de nascimento: ");
            int dia = sc.nextInt();
            System.out.print("Mês de nascimento: ");
            int mes = sc.nextInt();
            System.out.print("Ano de nascimento: ");
            int ano = sc.nextInt();
            
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            sc.nextLine();

            Data dataNasc = new Data(dia, mes, ano);
            Pessoa novaPessoa = new Pessoa(nome, sobrenome, 0, dataNasc, altura, peso, 0);

            novaPessoa.calculaIdade(dataNasc);
            novaPessoa.calculaIMC();

            pessoas[i] = novaPessoa;
            totalCadastrados++;
        }

        for (int i = 0; i < totalCadastrados; i++) {
            Pessoa p = pessoas[i];
            
            System.out.println("\nCadastro " + (i + 1) + ":");
            System.out.println("Nome completo: " + p.getNome() + " " + p.getSobrenome());
            
            //citacao
            System.out.println("Nome de referência: " + p.getSobrenome() + ", " + p.getNome().toUpperCase());
            
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("Altura: " + p.getAltura());
            
            System.out.printf("IMC: %.2f\n", p.getImc());
            System.out.println("Classificação: " + p.informaObesidade());
        }

    }
}
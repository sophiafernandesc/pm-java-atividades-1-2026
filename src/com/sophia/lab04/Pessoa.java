package com.sophia.lab04;
import java.util.Calendar;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private Data dataNasc;
	private double altura;
	private double peso;
	private double imc;
	
	public Pessoa() {
	}

	public Pessoa(String nome, String sobrenome, int idade, Data dataNasc, double altura, double peso, double imc) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.dataNasc = dataNasc;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public double calculaIMC() {
		imc = this.peso / (Math.pow(this.altura, 2));
		return this.imc; 
	}
	
	public String informaObesidade() {
	    if (this.imc < 18.5) {
	    	return "Abaixo do peso";
	    }
	    else if (this.imc < 25.0) {
	    	return "Peso normal";
	    }
	    else if (this.imc < 30.0) {
	    	return "Sobrepeso";
	    }
	    else if (this.imc < 35.0) {
	    	return "Obesidade grau 1";
	    }
	    else if (this.imc < 40.0) {
	    	return "Obesidade grau 2";
	    }
	    else return "Obesidade grau 3";
	}
	
	public int calculaIdade(Data dataNasc) {
		
	    Calendar hoje = Calendar.getInstance();
	    int anoAtual = hoje.get(Calendar.YEAR);
	    
	    int mesAtual = hoje.get(Calendar.MONTH) + 1; 
	    int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

	    int idadeCalculada = anoAtual - dataNasc.getAno();

	    if (mesAtual < dataNasc.getMes() || (mesAtual == dataNasc.getMes() && diaAtual < dataNasc.getDia())) {
	        idadeCalculada--; 
	    }

	    this.idade = idadeCalculada;
	    return this.idade;
	}
	
}

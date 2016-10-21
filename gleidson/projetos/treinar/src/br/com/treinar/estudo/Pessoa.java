package br.com.treinar.estudo;

public class Pessoa {

	public int idade;
	public String nome;

	public Pessoa() {
		super();
	}

	public Pessoa(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
	}

}

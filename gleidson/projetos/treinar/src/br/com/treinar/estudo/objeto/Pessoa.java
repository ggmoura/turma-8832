package br.com.treinar.estudo.objeto;

import javafx.scene.shape.QuadCurve;

public class Pessoa {

	public String nome;
	public Boolean estaAndando;
	public Integer qtdPassosPercorrida;
	
	public Pessoa() {
		qtdPassosPercorrida = 0;
	}
	
	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}
	
	public void andar(Integer qtdPassos) {
		for (int i = 0; i < qtdPassos; i++) {
			andar();
		}
	}
	
	public void andar() {
		System.out.println("estou andando... e para fazer isso da um trabalhão!!!");
		qtdPassosPercorrida += 1;
		estaAndando = Boolean.TRUE;
	}

	public void andar(Integer qtdPassos, Boolean direcao) {
		
		Integer qtdPassosPercorrida = 0;
		
		System.out.println("estou andando...");
		if (direcao) {
			qtdPassosPercorrida += qtdPassos;
		} else {
			qtdPassosPercorrida -= qtdPassos;			
		}
		this.qtdPassosPercorrida = qtdPassosPercorrida;
		estaAndando = Boolean.TRUE;
	}
	
	public Integer pular() {
		System.out.println("Estou pulando");
		return nome.length();
	}
	
	public String inverterNome() {
		return new StringBuilder(nome).reverse().toString();
	}
	
}

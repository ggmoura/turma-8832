package br.com.treinar.estudo.objeto;

public class Pessoa {

	public String nome;
	public Boolean estaAndando;
	public Integer qtdPassosPercorrida;
	
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
		System.out.println("estou andando...");
		if (direcao) {
			qtdPassosPercorrida += qtdPassos;
		} else {
			qtdPassosPercorrida -= qtdPassos;			
		}
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

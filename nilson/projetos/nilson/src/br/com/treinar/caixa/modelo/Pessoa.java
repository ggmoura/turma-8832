package br.com.treinar.caixa.modelo;

public class Pessoa {

	public int cpf;
	public String nome;
	public int idade;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade
				+ "]";
	}
	
}

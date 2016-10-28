package br.com.treinar.agenda.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Pessoa {

	private Long id;
	private String nome;
	private Sexo sexo;
	private Date dataNascimento;
	private List<Contato> contatos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Metodo para conversao de string em date
	 * 
	 * @param dataTeclado
	 *            data no formata dd/MM/yyyy
	 */
	public void setDataNascimentoStr(String dataTeclado) {
		try {
			DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			dataNascimento = formatador.parse(dataTeclado);
		} catch (ParseException e) {
			System.out.println("Erro ao converter a data");
			;
		}
	}

	/**
	 * Metodo para conversao de date em string
	 * 
	 * @param Objeto
	 *            Date
	 * @return String data formatada dd/MM/yyyy
	 */
	public String getDataNascimentoStr() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return formatador.format(dataNascimento);
	}

	public String toString() {
		String output = getDataNascimentoStr();

		return "Pessoa [" + (id != null ? "id=" + id + ", " : "") + (nome != null ? "nome=" + nome + ", " : "")
				+ (sexo != null ? "sexo=" + sexo + ", " : "")
				+ (dataNascimento != null ? "dataNascimento=" + output + ", " : "")
				+ (contatos != null ? "contatos=" + contatos : "") + "]";
	}

}

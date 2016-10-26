package br.com.treinar.agenda.modelo;

public class Contato {

	private Long id;
	private String email;
	private Telefone telefone;
	private Pessoa pessoa;
	
//	create table contato (
//	  id BIGINT NOT NULL AUTO_INCREMENT,
//	  email VARCHAR(255),
//	  telefone BIGINT,
//	  pessoa BIGINT,
//	  primary key (id)
//	);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}

package br.com.agenda.test;

import java.util.Date;

import br.com.treinar.agenda.dao.PessoaDAO;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;

public class TesteDAOPessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Maria Sophia");
		p.setSexo(Sexo.F);
		p.setDataNascimento(new Date());
		
		PessoaDAO dao = new PessoaDAO();
		dao.inserir(p);

		Pessoa p1 = dao.recuperar(p.getId());
		System.out.println(p1.getNome());
		
		p1.setNome("Nathalia Cravo Moura");
		p1.setSexo(Sexo.F);
		dao.atualizar(p1);
		
		dao.excluir(p1);
	
	}
	
}

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

		Pessoa p1 = dao.recuperar(1l);
		System.out.println(p1.getNome());
		
		Pessoa excluido = new Pessoa();
		excluido.setId(7l);
		dao.excluir(excluido);
		
		p1.setNome("Nathalia Cravo Moura");
		p1.setSexo(Sexo.F);
		dao.atualizar(p1);
		
	}
	
}

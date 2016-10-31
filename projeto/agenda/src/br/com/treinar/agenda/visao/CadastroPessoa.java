package br.com.treinar.agenda.visao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.treinar.agenda.dao.PessoaDAO;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;

public class CadastroPessoa {

	public static void main(String[] args) throws Exception {

		PessoaDAO dao = new PessoaDAO();
		Scanner exibe = new Scanner(System.in);
		Integer opcao = null;

		do {
			System.out.println(
					"\nDigite a opção desejada: \n\t0 - Sair\n\t1 - Pesquisar\n\t2 - Excluir\n\t3 - Editar\n\t4 - Cadastrar \n\n");
			opcao = exibe.nextInt();
			Pessoa pessoa;
			switch (opcao) {
			case 0:
				System.out.print("Até logo.");
				break;
			case 1:
				Listar(dao);

				break;
			case 2:

				System.out.println("Informe o ID para excluir: ");
				Long id = exibe.nextLong();
				pessoa = new Pessoa();
				pessoa.setId(id);
				dao.excluir(pessoa);
			
				break;
			case 3:

				break;
			case 4:
				InclusaoPessoa(dao, exibe);

				break;
			default:
				System.out.println("Opção invalida!");
				break;
			}
		} while (opcao != 0);
		exibe.close();
	}

	private static void InclusaoPessoa(PessoaDAO dao, Scanner exibe) throws ParseException {
		Pessoa p = new Pessoa();
		System.out.print("Informe o nome: ");
		p.setNome(exibe.next());
		System.out.print("Insira a data de nascimento: ");
		String dataNasc = exibe.next();
		DateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInf = formata.parse(dataNasc);
		p.setDataNascimento(dataInf);
		System.out.print("Informe F ou M para cadastrar o sexo: ");
		p.setSexo(Sexo.valueOf(exibe.next()));

		dao.inserir(p);
	}

	private static void Listar(PessoaDAO dao) {
		List<Pessoa> pessoas = dao.listarTodos();
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getId() + " - " + pessoa.getNome());
		}
	}

}

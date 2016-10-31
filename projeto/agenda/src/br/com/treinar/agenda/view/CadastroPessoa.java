package br.com.treinar.agenda.view;

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
		
		Scanner leitor = new Scanner(System.in);
		int opcao;
		
		do {
			
			System.out.println("\t\nSelecione uma opção:\t\n\n 0 - Sair do programa\t\n 1 - Cadastrar pessoa\t\n 2 - Editar pessoa \t\n 3 - Excluir Pessoa \t\n 4 - Exibir Pessoa\t\n");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
				incluirpessoa(dao, leitor);			
				break;
	
			case 2: 
				
				
				break;
			
			case 3: 
				listartodos(dao);
				excluirpessoa(dao, leitor);
				break;
			
			case 4: 
				listartodos(dao);
				break;
			
			default:
				break;
			}
		} while (opcao != 0);
	}

	private static void excluirpessoa(PessoaDAO dao, Scanner leitor) {
		
	
	}

	private static void incluirpessoa(PessoaDAO dao, Scanner leitor) throws ParseException {
		Pessoa p1 = new Pessoa();
		System.out.print("Informe o nome: ");
		p1.setNome(leitor.next());
		System.out.print("Informe o sexo M ou F: ");
		p1.setSexo(Sexo.valueOf(leitor.next()));
		System.out.print("Informe a data de nascimento: ");
		String dataNasc = leitor.next();
		DateFormat formatador = new SimpleDateFormat("dd/mm/yyyy");
		Date dataInf = formatador.parse(dataNasc);
		p1.setDataNascimento(dataInf);
		dao.inserir(p1);
	}

	private static void listartodos(PessoaDAO dao) {
		List<Pessoa> pessoas = dao.listarTodos();
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getId() + " - " + pessoa.getNome());
		}
	}
}

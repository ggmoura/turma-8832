package br.com.treinar.agenda.view;

<<<<<<< HEAD
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.DALOAD;

import br.com.treinar.agenda.dao.PessoaDAO;
import br.com.treinar.agenda.modelo.Pessoa;
import br.com.treinar.agenda.modelo.Sexo;

public class CadastroPessoa {
	static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Scanner leitor = new Scanner(System.in);
		Integer opcao = null;
		do {
			System.out.println(
					"Digite:\n  0 - Sair do Programa \n 1 - Cadastrar \n 2 - Editar \n 3 - Consultar \n 4 - Excluir \n");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Fim do programa");
				break;
			case 1:
				Cadastrar();
				break;
			case 2:
				Editar();
				break;
			case 3:
				Consultar();
				break;
			// case 4:
			// Excluir(null);
			// break;
			default:
				System.out.println("Opção Inválida, informe novamente!\n\n");
				break;
			}

		} while (opcao != 0);
		leitor.close();

	}

	private static void Consultar() {
		PessoaDAO dao = new PessoaDAO();
		System.out.println("Informe o ID da pessoa que deseja consultar.");
		Long id = 0l; 
		id = leitor.nextLong();
		dao.recuperar(id);
		Pessoa pessoa1 = null;
		System.out.println(pessoa1.getId() + " " + pessoa1.getNome());

	}

	private static void Editar() throws Exception {
		Pessoa pessoa = new Pessoa();
		String nome = null;
		Sexo sexo;
		String dataNascimento;
		PessoaDAO dao = new PessoaDAO();
		List<Pessoa> pessoas = dao.listarTodos();
		for (Pessoa pessoa1 : pessoas) {
			System.out.println(pessoa1.getId() + " " + pessoa1.getNome());
		}
		
		Scanner leitor = new Scanner(System.in);
		Long id = 0l; 
		System.out.println("Informe o ID que deseja alterar");
		id = leitor.nextLong();
		leitor.nextLine();
		pessoa = dao.recuperar(id);
		System.out.println("Corrija o nome");
		pessoa.setNome(leitor.nextLine());
		System.out.println("Corrija o Sexo");
		pessoa.setSexo(Sexo.valueOf(leitor.nextLine()));
		System.out.println("Corrija a data de nascimento:");
		dataNascimento = leitor.nextLine();
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInformada = formatador.parse(dataNascimento);
		pessoa.setDataNascimento(dataInformada);
		dao.atualizar(pessoa);
	}

	private static void Cadastrar() throws ParseException {
		Scanner leitor = new Scanner(System.in);
		String nome = null;
		Sexo sexo;
		String dataNascimento;
		Pessoa pessoa = new Pessoa();
		System.out.println("Informe o nome:");
		nome = leitor.nextLine();
		System.out.println("Informe o Sexo: (M) masculino ou (F) feminino");
		sexo = Sexo.valueOf(leitor.nextLine());
		System.out.println("Informe a data de nascimento:");
		dataNascimento = leitor.nextLine();
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInformada = formatador.parse(dataNascimento);
		pessoa.setNome(nome);
		pessoa.setDataNascimento(dataInformada);
		pessoa.setSexo(sexo);

		PessoaDAO dao = new PessoaDAO();
		dao.inserir(pessoa);

	}
=======
public class CadastroPessoa {
>>>>>>> branch 'master' of https://github.com/ggmoura/turma-8832.git

}

package exercicio;

import java.util.Scanner;
import exercicio.Aluno;
import exercicio.Escola;
import exercicio.GradeCurricular;
import exercicio.Financeiro;
import exercicio.Disciplina;

public class TelaInicio {

	Scanner leitor = new Scanner(System.in);
	
	public void inicio() {
		Integer opcao  = null;
		do {
			System.out.print("\n          ---- CADASTRO ESCOLAR ----\n\t"
					+ "=============================\n\t"
					+ "1 - Cadastrar Escola\n\t"
					+ "2 - Cadastrar Aluno\n\t"
					+ "3 - Cadastrar Disciplina\n\t"
					+ "4 - Cadastro Financeiro\n\t"
					+ "5 - Cadastrar Grade Curricular\n\t"
					+ "9 - Sair\n"
					+ "\nEscolha uma opcao: ");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 9:
				System.out.println("Fim do programa");
				break;
			case 1:
				cadastrarEscola();
				break;
			case 2:
				cadastrarAluno();
				break;
			case 3:
				cadastrarDisciplina();
				break;
			case 4:
				cadastrarFinanceiro();
				break;
			case 5:
				cadastrarGradeCurricular();
				break;
			default:
				System.out.println("opcao inv�lida !!! Informe novamente!\n\n");
				break;
			}
			
		} while (opcao != 9);
		leitor.close();

    }

	public void cadastrarGradeCurricular() {

		GradeCurricular gc = new GradeCurricular();
		
		System.out.print("Informe o nome da DISCIPLINA: ");		
		gc.Disciplina.nomedisciplina = (leitor.nextLine());
		
		leitor.nextLine();
		
		System.out.print("Informe o C�DIGO da DISCIPLINA: ");		
		gc.Disciplina.codigodisciplina = (leitor.nextInt());
		
		System.out.print("Informe o CARGA HORARIA: ");		
		gc.cargaHoraria = (leitor.nextShort());
		
		System.out.print("Informe o CARGA HORARIA: ");		
		gc.preRequisito = (leitor.nextLine());
		
		
	}

	public void cadastrarFinanceiro() {
		
		Financeiro fi = new Financeiro();
		
		System.out.print("Informe o nome da DISCIPLINA: ");		
		fi.disciplina.nomedisciplina = (leitor.nextLine());
		
		leitor.nextLine();
		
		System.out.print("Informe o C�DIGO da DISCIPLINA: ");		
		fi.disciplina.codigodisciplina = (leitor.nextInt());
		
		System.out.print("Informe o VALOR da MENSALIDADE: ");		
		fi.valorMensalidade = (leitor.nextInt());
	
	}

	public void cadastrarDisciplina() {

		Disciplina di = new Disciplina();
		System.out.print("Informe o nome da DISCIPLINA: ");		
		di.nomedisciplina = (leitor.nextLine());
		
		leitor.nextLine();
		
		System.out.print("Informe o C�DIGO da DISCIPLINA: ");		
		di.codigodisciplina = (leitor.nextInt());
		
	}

	public void cadastrarAluno() {

		Aluno al = new Aluno();
		System.out.print("Informe o nome do aluno: ");		
		al.nome = (leitor.nextLine());
		
		leitor.nextLine();
		
		System.out.print("Informe a idade do aluno: ");		
		al.idade = (leitor.nextInt());
		
		System.out.print("Informe o CPF do aluno: ");		
		al.cpf = (leitor.nextInt());
		
		System.out.print("Informe a identidade do aluno: ");		
		al.idade = (leitor.nextInt());
		
	}

	public void cadastrarEscola() {

		Escola es = new Escola();
		
		System.out.print("Informe o nome da Escola: ");		
		es.nome = (leitor.nextLine());

		System.out.print("Informe o endereco da Escola: ");		
		es.endereco = (leitor.nextLine());

		System.out.print("Informe o telefone da Escola: ");		
		es.telefone = (leitor.nextInt());
		
		System.out.print("Informe o CEP da Escola: ");		
		es.cep = (leitor.nextInt());

		System.out.print("Informe o ESTADO da Escola: ");		
		es.estado = (leitor.nextLine());

		System.out.print("Informe a CIDADE da Escola: ");		
		es.cidade = (leitor.nextLine());
		
	}
}

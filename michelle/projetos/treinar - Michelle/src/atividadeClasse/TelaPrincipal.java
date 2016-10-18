package atividadeClasse;

import java.util.Scanner;

public class TelaPrincipal {
	
public static void main(String[] args) {
	
		Turma novaTurma = new Turma();
		novaTurma.disciplina = new Disciplina();
	
		
			
		Scanner exibe = new Scanner(System.in);
		Integer opcao = null;
		
		do {
			System.out.println("\nDigite a opção desejada: \n\t0 - Sair\n\t1 - Criar Aluno\n\t2 - Criar Professor\n\t3 - Cadastrar nota\n\t4 - Exibir dados \n\n");
		opcao = exibe.nextInt();
		switch (opcao) {
		case 0:
			System.out.println("Até logo.");
			break;
		case 1:
			novaTurma.aluno = new Aluno();
			System.out.print("Informe o nome do aluno: ");
			novaTurma.aluno.nomeAluno = exibe.next();
			System.out.print("Informe a matricula: ");
			novaTurma.aluno.matricula=exibe.nextInt();
			System.out.print("Informe a turma: ");
			novaTurma.codTurma =exibe.nextInt();
			System.out.print("Cadastro do aluno " + novaTurma.aluno.nomeAluno + " foi realizado com a matricula " + novaTurma.aluno.matricula + "." );
					
		break;
		case 2:
			novaTurma.professor = new Professor();
			System.out.print("Informe o nome do professor: ");
			novaTurma.professor.nomeProf = exibe.next();
			System.out.print("Informe a disciplina do professor: ");
			novaTurma.disciplina.nomeDisc = exibe.next(); // como fazer para colocar Chico Bento na mesma linha e imprimir
			System.out.print("Cadastro do professor " + novaTurma.professor.nomeProf + " da disciplina " + novaTurma.disciplina.nomeDisc + ".");
		break;
		case 3:
			novaTurma.aluno.prova = new Prova();
			System.out.print("Informe a nota do aluno: ");
			novaTurma.aluno.prova.notaProva = exibe.nextFloat();
			System.out.print("Nota do aluno " + novaTurma.aluno.nomeAluno + " é: " + novaTurma.aluno.prova.notaProva);
		break;
		case 4:
			System.out.println("Nome do Aluno: " + novaTurma.aluno.nomeAluno );
			System.out.println("Matricula do Aluno: " + novaTurma.aluno.matricula );
			System.out.println("Turma do Aluno: " + novaTurma.codTurma);
			System.out.println("Professor: " + novaTurma.professor.nomeProf);
			System.out.println("Materia: " + novaTurma.disciplina.nomeDisc );
			System.out.println("Nota: " + novaTurma.aluno.prova.notaProva );
		break;
		default:
			System.out.println("Opção invalida!");
			break;
		}
		}while (opcao != 0);
		exibe.close();
		
		//novaTurma.codTurma = 100;
		//novaTurma.professor.nomeProf = "Chico Bento";
		//novaTurma.disciplina.nomeDisc = "Arte de catar cenoura";
		//novaTurma.aluno.matricula = 789;
		//novaTurma.aluno.nomeAluno = "Michelle";
		//novaTurma.aluno.prova.notaProva = 9.5F;
		
		//Aluno aluno = new Aluno();
		//aluno = novaTurma.aluno;
		//System.out.println(aluno.nomeAluno);
		
		//Professor professor = new Professor();
		//professor = novaTurma.professor;
		//System.out.println(professor.nomeProf);
		
		//Disciplina disciplina = new Disciplina();
		//disciplina = novaTurma.disciplina;
		//System.out.println(disciplina.nomeDisc);
		
		//Prova prova = new Prova();
		//prova = novaTurma.aluno.prova;
		//System.out.println(prova.notaProva);
		

		

	}
				
			
			

			
			
			
		}



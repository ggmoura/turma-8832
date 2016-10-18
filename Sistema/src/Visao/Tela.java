package Visao;
import java.util.Scanner;
import Modelo.Produto;

public class Tela {

	private Scanner leitor;
	Produto produto = new Produto();

	public Tela() {
		leitor = new Scanner(System.in);
	}

	public void iniciarAtividades() {
		Integer opcao = null;
		do {
			System.out.println(recuperarMenu());
			opcao = leitor.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Fim do programa");
				break;
			case 1:
				criarProduto(produto);
				break;
			case 2:
				exibirDados();
				break;
			case 3:
				comprar();
				break;

			default:
				System.out.println("Opção Inválida, informe novamente!\n\n");
				break;
			}

		} while (opcao != 0);
		leitor.close();
	}

	private void comprar() {
		System.out.println("Informa o nome do produto: ");

	}


	private void exibirDados() {

		System.out.println("Nome: " + produto.getNome());
		System.out.println("Valor: " + produto.getValorProduto());
		System.out.println("Quantidade: " + produto.getQuantidade());

	}

	private void criarProduto(Produto produto) {

		leitor.nextLine();
		System.out.println("Nome");
		produto.setNome(leitor.nextLine());
		System.out.println("Valor");
		produto.setValorProduto(leitor.nextInt());
		System.out.println("Quantidade");
		produto.setQt(leitor.nextInt());

	}

	private String recuperarMenu() {
		return "Informe\n\t" + 
				"0 - Sair\n\t" + 
				"1 - Criar Produto\n\t" + 
				"2 - Comprar\n\t";

	}

}

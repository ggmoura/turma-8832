package jefferson;

public class PrincipalAtividade {

	public static void main(String[] args) {
	
		Pais novoPais = new Pais();
		novoPais.nome = "Brasil";
		novoPais.populacao = 106000000l;
		
		Estado novoEstado = new Estado();
		novoEstado.regiao = "Sudeste";
		novoEstado.populacao = 20000000l;		
		
		novoEstado.pais = novoPais;
			
		System.out.println(novoEstado.regiao);
		System.out.println(novoEstado.populacao);
		System.out.println(novoEstado.pais.nome);
		System.out.println(novoPais.nome);
		
		//aluno, professor, turma, diciplina e prova.
	}

}

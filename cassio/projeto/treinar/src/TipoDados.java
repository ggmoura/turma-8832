
public class TipoDados {

	public static void main(String[] args) {
		//byte b = 127;
		//System.out.println(b);
		
		byte qtdAlunos = 9;
		System.out.println("Quantidade de alunos da turma: "+qtdAlunos);
		
		short bairrosDaCidade = 1000;
		System.out.println("Quantidade de bairros da cidade: "+bairrosDaCidade);

		int populacaoDaCidade = 2950000;
		System.out.println("População da cidade: "+populacaoDaCidade);
		
		long populacaoMundial = 700000000000l; //colocar a letra para que o valor seja interpretado como long ao invés de int é chamado "casting"
		System.out.println("População mundial: "+populacaoMundial);
	
		float media = (float) 0.75; //colocar a letra é chamado "casting"
		System.out.println("Media: "+media);
		
		double valor = 0.99595959595959; //colocar a letra é chamado "casting"
		System.out.println("Valor: "+valor);
		
		boolean sim = true;
		System.out.println(sim);
		
		char a = 'A';
		System.out.println("char a = " +a);
		
		char literal = '\''; //representa aspas simples(')
		System.out.println("char literal = " +literal);
		
		
	}
}

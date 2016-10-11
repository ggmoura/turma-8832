
public class CadastroPessoa {
	public static void main(String[] args) {
		
		Pessoa novaPessoa = null;
		System.out.println("Criar Pessoa 1");
		novaPessoa = new Pessoa();
		novaPessoa.nome = "Michelle";
		novaPessoa.idade = 31;
				
		Pessoa novaPessoa2 = novaPessoa;
		
		System.out.println(novaPessoa.nome);
		System.out.println(novaPessoa2.nome);
		
		novaPessoa2.nome = "Daniella";
		
		System.out.println(novaPessoa.nome);
		
		
		novaPessoa2 = new Pessoa();
		//novaPessoa2.nome = "Cesar"; se nao informar um novo valor, sera impresso null
		System.out.println(novaPessoa2.nome);
	
		
	
	}
}

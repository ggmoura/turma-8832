
public class TesteComparacao {
	public static void main(String[] args) {
		
		Pessoa novaPessoa = null;
		novaPessoa = new Pessoa();
		novaPessoa.nome = "Michelle";
		System.out.println("1 pessoa : " + novaPessoa.nome);
		
		Pessoa novaPessoa2 = null;
		novaPessoa2 = new Pessoa();
		novaPessoa2.nome = "Michelle";
		System.out.println("2 pessoa : " +novaPessoa2.nome);
		
		System.out.println("Compara 1 com 2 pessoa: " + (novaPessoa == novaPessoa2));
		
		novaPessoa = novaPessoa2;
		
		System.out.println("Pessoa 1 recebe pessoa 2: " + novaPessoa.nome);
		System.out.println("Nova comparação : "  + (novaPessoa == novaPessoa2));

	}

}

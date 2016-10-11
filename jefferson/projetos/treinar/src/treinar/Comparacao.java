package treinar;

public class Comparacao {
	public static void main(String[] args) {

		Pessoa novaPessoa = new Pessoa();
		novaPessoa.nome = "Jefferson";
		
		Pessoa p = new Pessoa();
		p.nome = "Jefferson";
		
		System.out.println(novaPessoa == p);
		
		p = novaPessoa;
		System.out.println(novaPessoa == p);
		
		
	}
}

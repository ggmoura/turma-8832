package treinar;

public class TestePessoa {

		public static void main(String[] args) {
			
			Pessoa novaPessoa = new Pessoa();
			novaPessoa.nome = "Jefferson";
			novaPessoa.idade = 24;
			
			System.out.println("Nome:" + novaPessoa.nome + "\n Idade:" + novaPessoa.idade);
			
			Pessoa p = new Pessoa();
			p = novaPessoa;
			
			System.out.println(p.nome);
			
			p.nome = "Julia";
			
			System.out.println(p.nome);
			
			novaPessoa = new Pessoa();
			novaPessoa.nome = "Jefferson";
			novaPessoa.idade = 24;
			p.idade = 4;
			
			
			System.out.println("Nome:" + novaPessoa.nome + "\n Idade:" + novaPessoa.idade);
			System.out.println("Nome:" + p.nome + "\n Idade:" + p.idade);
		}
		
}

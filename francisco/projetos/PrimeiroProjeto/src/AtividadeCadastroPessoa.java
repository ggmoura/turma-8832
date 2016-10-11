
public class AtividadeCadastroPessoa {
	
	public static void main(String[] args) {
		
		Pessoa novaPessoa = null;
		novaPessoa = new Pessoa();
		
		novaPessoa.nome = "Paula";
		novaPessoa.idade = 10;
		System.out.println("NP1_Nome : " + novaPessoa.nome);
		System.out.println("NP1_Idade: " + novaPessoa.idade);
				
		
		Pessoa novaPessoa2 = null;
		novaPessoa2 = new Pessoa();
		
		// Criando uma Nova variável de novapessoa3 apontando para a variável antiga.
		// Outra forma de se fazer a mesma coisa.
		// Pessoa novaPessoa3 = novaPessoa;


		novaPessoa2.nome = "Joao";
		novaPessoa2.idade = 35;
		System.out.println("NP2_Nome : " + novaPessoa2.nome);
		System.out.println("NP2_Idade: " + novaPessoa2.idade);
		
		
		// Igualar as variáveis -- No java só é alterado a referencia para onde o endereço de memória aponta.
		// Sendo assim a variável novaPessoa2 vai ter o mesmo endereço de memória do novaPessoa e terão a mesma informação.
		
		System.out.println(" ** VARIÁVEIS SÃO IGUALADAS ");
		novaPessoa2 = novaPessoa;  
		System.out.println("NP1_Nome : " + novaPessoa.nome);
		System.out.println("NP1_Idade: " + novaPessoa.idade);
		System.out.println("NP2_Nome : " + novaPessoa2.nome);
		System.out.println("NP2_Idade: " + novaPessoa2.idade);

		System.out.println(" ** PASSA NOVO ENDEREÇO DE MEMÓRIA PARA VARIÁVEL novaPessoa2  " );		
		novaPessoa2 = new Pessoa();
		System.out.println("NP1_Nome : " + novaPessoa.nome);
		System.out.println("NP1_Idade: " + novaPessoa.idade);
		System.out.println("NP2_Nome : " + novaPessoa2.nome);
		System.out.println("NP2_Idade: " + novaPessoa2.idade);

		
			
	}

}

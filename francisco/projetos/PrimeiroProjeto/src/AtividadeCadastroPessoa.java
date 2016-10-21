
public class AtividadeCadastroPessoa {
	
	public static void main(String[] args) {
		
		Pessoa1 novaPessoa = null;
		novaPessoa = new Pessoa1();
		
		novaPessoa.nome = "Paula";
		novaPessoa.idade = 10;
		System.out.println("NP1_Nome : " + novaPessoa.nome);
		System.out.println("NP1_Idade: " + novaPessoa.idade);
				
		
		Pessoa1 novaPessoa2 = null;
		novaPessoa2 = new Pessoa1();
		
		// Criando uma Nova vari�vel de novapessoa3 apontando para a vari�vel antiga.
		// Outra forma de se fazer a mesma coisa.
		// Pessoa novaPessoa3 = novaPessoa;


		novaPessoa2.nome = "Joao";
		novaPessoa2.idade = 35;
		System.out.println("NP2_Nome : " + novaPessoa2.nome);
		System.out.println("NP2_Idade: " + novaPessoa2.idade);
		
		
		// Igualar as vari�veis -- No java s� � alterado a referencia para onde o endere�o de mem�ria aponta.
		// Sendo assim a vari�vel novaPessoa2 vai ter o mesmo endere�o de mem�ria do novaPessoa e ter�o a mesma informa��o.
		
		System.out.println(" ** VARI�VEIS S�O IGUALADAS ");
		novaPessoa2 = novaPessoa;  
		System.out.println("NP1_Nome : " + novaPessoa.nome);
		System.out.println("NP1_Idade: " + novaPessoa.idade);
		System.out.println("NP2_Nome : " + novaPessoa2.nome);
		System.out.println("NP2_Idade: " + novaPessoa2.idade);

		System.out.println(" ** PASSA NOVO ENDERE�O DE MEM�RIA PARA VARI�VEL novaPessoa2  " );		
		novaPessoa2 = new Pessoa1();
		System.out.println("NP1_Nome : " + novaPessoa.nome);
		System.out.println("NP1_Idade: " + novaPessoa.idade);
		System.out.println("NP2_Nome : " + novaPessoa2.nome);
		System.out.println("NP2_Idade: " + novaPessoa2.idade);

		
			
	}

}

package pessoa;

public class NovaPessoa {

	public static void main(String[] args) {
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.idade = 17;
		novaPessoa.sexo = 'M';
		novaPessoa.nome = "Cássio";
		
		Pessoa novaPessoa2 = novaPessoa; //criação de novaPessoa2 apontando para o mesmo endereço de memoria de novaPessoa
		
		System.out.println(novaPessoa.nome);
		System.out.println(novaPessoa2.nome);
		
		novaPessoa2.nome = "José"; //como as duas variaveis apontam para o mesmo endereco, altera o nome nas duas
		System.out.println(novaPessoa.nome);
		System.out.println(novaPessoa2.nome);
		
		novaPessoa2 = new Pessoa(); //nova pessoa passa a apontar para um novo endereço de memoria "limpo"
		
		System.out.println("O nome eh: "+novaPessoa2.nome); //vai imprimir null
		
		//novaPessoa2 = novaPessoa;
		novaPessoa2 = new Pessoa();
		
		Pessoa novaPessoa3 = novaPessoa2 = novaPessoa; 
		System.out.println(novaPessoa.nome);
		System.out.println(novaPessoa2.nome);
		System.out.println(novaPessoa3.nome);
		
		novaPessoa3.nome = "Maria";
		System.out.println(novaPessoa.nome);
		System.out.println(novaPessoa2.nome);
		System.out.println(novaPessoa3.nome);
				
	}
}

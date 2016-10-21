
public class AtividadeTesteComparacao {

	public static void main(String[] args) {
		
		Pessoa1 p1 = null;
		p1 = new Pessoa1();
		Pessoa1 p2 = p1;

		p1.nome = "Paulo";
		System.out.println("Compara��o ap�s atribuir novo endere�o de mem�ria");
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p1 == p2);

		System.out.println("Compara��o ap�s atribuir novo endere�o de mem�ria");
		p2 = new Pessoa1(); // Aqui nesse ponto endere�o de mem�ria � outro.
		p2.nome = "Paulo";
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p1 == p2); //Observe que estamos comparando o objeto e n�o o conte�do do objeto.

		System.out.println("Comparativo de conte�do do objeto");
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p1.nome == p2.nome); //Observe que estamos comparando o objeto e n�o o conte�do do objeto.
	
	}
}

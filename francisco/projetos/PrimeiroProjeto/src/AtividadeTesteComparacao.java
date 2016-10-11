
public class AtividadeTesteComparacao {

	public static void main(String[] args) {
		
		Pessoa p1 = null;
		p1 = new Pessoa();
		Pessoa p2 = p1;

		p1.nome = "Paulo";
		System.out.println("Comparação após atribuir novo endereço de memória");
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p1 == p2);

		System.out.println("Comparação após atribuir novo endereço de memória");
		p2 = new Pessoa(); // Aqui nesse ponto endereço de memória é outro.
		p2.nome = "Paulo";
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p1 == p2); //Observe que estamos comparando o objeto e não o conteúdo do objeto.

		System.out.println("Comparativo de conteúdo do objeto");
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p1.nome == p2.nome); //Observe que estamos comparando o objeto e não o conteúdo do objeto.
	
	}
}

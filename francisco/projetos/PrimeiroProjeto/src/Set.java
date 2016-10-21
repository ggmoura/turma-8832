import java.util.HashSet;

public class Set {
	
	public static void main(String[] args) {
		
		Pessoa1 p1 = new Pessoa1();
		Pessoa1 p2 = new Pessoa1();
		Pessoa1 p3 = new Pessoa1();
		
		
		p1.nome = "Ana";
		p1.sobrenome = "Claudia";
		p2.nome = "Ana";
		p2.sobrenome = "Claudia";
		p3.nome = "Ana";
		p3.sobrenome = "Paula";
	
		 
		java.util.Set<Pessoa1> pessoas = new HashSet<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		System.out.println(pessoas);
	}

}

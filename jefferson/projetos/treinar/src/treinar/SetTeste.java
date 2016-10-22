package treinar;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {

	public static void main(String[] args) {
		Set<Pessoa> set = new HashSet<>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Jefferson";
		pessoa.idade = 21;
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Jefferson";
		pessoa1.idade = 21;
		
		Pessoa pessoa3 = pessoa;
		
		set.add(pessoa);
		set.add(pessoa1);
		set.add(pessoa3);
		
		
		
		System.out.println(set);
	}
}

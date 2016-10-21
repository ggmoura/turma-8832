package AulaObjeto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AtividadeSet {
	
	public static void main(String[] args) {
			
	Pessoa pessoa = new Pessoa();
	pessoa.nome = "Michelle";
	pessoa.idade = 31;
	
	Pessoa pessoa1 = new Pessoa();
	pessoa1.nome = "Michelle";
	pessoa1.idade =31;
	
	Pessoa pessoa2 = new Pessoa();
	pessoa2.nome = "Daniella";
	pessoa1.idade = 35;

	Set<Pessoa> set = new HashSet<Pessoa>();
	
	set.add(pessoa);
	set.add(pessoa1);
	set.add(pessoa2);
	
	System.out.println(set.size());
	
	Map<Sexo, Pessoa> mapPessoas = new HashMap<>();
	for
	

	

	}
}

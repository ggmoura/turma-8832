

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class EstudoMap {

	public static void main(String[] args) {
		Map<Sexo, Pessoa> mapPessoas = new HashMap<>();
		
		Pessoa homem = new Pessoa();
		homem.nome = "Gleidson";
		homem.idade = 37;
		
		Pessoa mulher = new Pessoa();
		mulher.nome = "Isabela";
		mulher.idade = 30;
		

		mapPessoas.put(Sexo.M, homem);
		mapPessoas.put(Sexo.F, mulher);
		System.out.println(mapPessoas);
		
		Set<Sexo> chavesDoMap = mapPessoas.keySet();
		
		System.out.println(chavesDoMap);
		
		Pessoa isabela = mapPessoas.get(Sexo.F);
		
		
		System.out.println(isabela);

		for (Sexo sexo : chavesDoMap) {
			System.out.println(mapPessoas.get(sexo));
		}
		

	}
	
}

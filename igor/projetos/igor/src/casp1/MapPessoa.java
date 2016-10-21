package casp1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import casp1.Pessoa;
import casp1.Sexo;

public class MapPessoa {

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
		
		mapPessoas.put(Sexo.M, new Pessoa());
		
		Set<Sexo> chavesDoMap = mapPessoas.keySet();
		
		System.out.println(chavesDoMap);
		
		Pessoa isabela = mapPessoas.get(Sexo.F);
		
		System.out.println(isabela);

	}
	
}

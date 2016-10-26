package collections;
import java.util.*;

import br.com.treinar.caixa.modelo.Pessoa;

public class TestMap2 {

	public enum Sexo {

		M, F;
	
	}
	
	public static void main(String[] args) {
		Map<Sexo, Pessoa> mapPessoas = new HashMap<>();
		
		Pessoa homem = new Pessoa();
		homem.nome  = "Gleidson";
		homem.idade = 37;
		homem.cpf   = 123456789;
		
		Pessoa mulher = new Pessoa();
		mulher.nome = "Isabela";
		mulher.idade = 30;
		mulher.cpf   = 987654321;
		
		mapPessoas.put(Sexo.M, homem);
		mapPessoas.put(Sexo.F, mulher);
		
		System.out.println("MapPessoas => " + mapPessoas);
		
	//	mapPessoas.put(Sexo.M, new Pessoa());
		
		Set<Sexo> chavesDoMap = mapPessoas.keySet();
		
		System.out.println("Chave do MAP => " + chavesDoMap);
		
		Pessoa isabela = mapPessoas.get(Sexo.F);
		
		System.out.println(isabela);
		
		for (Sexo s : chavesDoMap) {
			System.out.println(s + " " + mapPessoas.get(s));
		} 
		     	     
				

	}
	
}

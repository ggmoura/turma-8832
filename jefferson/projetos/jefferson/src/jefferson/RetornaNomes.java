package jefferson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class RetornaNomes {
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		String nome = null;
		
		do {
			System.out.println("Informe o nome:");
			nome = leitor.next();
			if (!nome.equalsIgnoreCase("Sair")) {
				System.out.println("Continue digitando");
			}
		} while (!nome.equalsIgnoreCase("Sair"));
		leitor.close();
	
	for (String nome : nomes) {
	    Integer count = map.get(nome);
	    if (count == null)
	       count = 0;
	    map.put(nome, count+1);
	}
	 
	}//Map<Caractere, List<String>> mapPessoas = new HashMap<>();
}

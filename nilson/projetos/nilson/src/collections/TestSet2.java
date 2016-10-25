package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import br.com.treinar.caixa.modelo.Pessoa;

public class TestSet2 {

	  public static void main(String args[]) { 
		  
		  Pessoa psa = new Pessoa();
		  Pessoa psb = new Pessoa();
		  
		  psa.nome = "Nilson";
		  psb.nome = "Nilson";
		  
		  Set set1 = new HashSet();
		  set1.add(psa.nome);
		  set1.add(psb.nome);
		  
	      System.out.println(" Elementos no set1 :" + set1);

	      Set<Pessoa> setx = new HashSet<>();
		  Set set2 = new HashSet();
		  set2.add(psa.nome);
		  set2.add(psb.nome);

	      System.out.println(" Elementos no set2 :" + set2);
	      
	   }

	
	} 
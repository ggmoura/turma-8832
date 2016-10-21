package br.com.treinar.estudo.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TesteCollections {

   public static void main(String[] args) {
      // ArrayList 
	   
      Collection a1 = new ArrayList();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      a1.add(10);
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);

   }
}
package br.com.treinar.estudo.estatico;

public class TesteAtributoStatic {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		System.out.println(ContaPoupanca.taxaRendimento);
		
		ContaPoupanca.taxaRendimento = 5;
		System.out.println(ContaPoupanca.taxaRendimento);
		
		cp.taxaRendimento = 2;
		
		System.out.println(ContaPoupanca.taxaRendimento);
		
		ContaPoupanca cp2 = new ContaPoupanca();
		
		System.out.println(ContaPoupanca.taxaRendimento);
		
	}
	
}

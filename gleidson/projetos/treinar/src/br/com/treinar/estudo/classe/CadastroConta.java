package br.com.treinar.estudo.classe;

public class CadastroConta {

	public static void main(String[] args) {
		
		Conta novaConta = null;
		System.out.println("irah criar um objeto do tipo Conta");
		novaConta = new Conta();
		novaConta.nome = "Gleidson";
		novaConta.agencia = 248;
		novaConta.cpf = 55546265302l;
		novaConta.numeroConta = 10481;
		novaConta.saldo = 10000.00;
		
		Conta novaConta2 = null;
		System.out.println("irah criar um objeto do tipo Conta dois");
		novaConta2 = new Conta();
		novaConta2.nome = "Maria Sophia";
		novaConta2.agencia = 248;
		novaConta2.cpf = 00046265302l;
		novaConta2.numeroConta = 10482;
		novaConta2.saldo = 10.00;
		
		System.out.println(novaConta.nome);
		
		novaConta = null;
		//null pointer access
		//System.out.println(novaConta.nome);
		
		novaConta = novaConta2;
		
		System.out.println();
		
		System.out.println(novaConta.nome);
		
		novaConta.nome = "Davi Lucas";
		
		System.out.println(novaConta2.nome);
		
		novaConta = null;
		
		System.out.println(novaConta2.nome);
		
		novaConta2 = null;
		
		System.out.println("fim");
		
		
	}
	
}

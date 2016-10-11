package br.com.treinar.caixa;

public class CadastroConta {
	
	public static void main(String[] args) {
		
		Conta novaConta = new Conta();
		
		novaConta.nome        = "Nilson";
		novaConta.agencia     = 248;
		novaConta.cpf         = 99884458758l;
		novaConta.numeroConta = 10481;
		novaConta.saldo       = 100000.00;
		
		System.out.println(novaConta.nome);
		System.out.println(novaConta.agencia);
		System.out.println(novaConta.cpf);
		System.out.println(novaConta.numeroConta);
		System.out.println(novaConta.saldo);
		
	}

}

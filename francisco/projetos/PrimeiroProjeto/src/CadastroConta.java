
public class CadastroConta {
	
	public static void main(String[] args) {
		
		Conta novaConta = null;
		System.out.println("Irah criar um objeto do tipo Conta");
		novaConta = new Conta ();
		novaConta.nome = "Francisco";
		novaConta.agencia = 248;
		novaConta.cpf = 32445633380l;
		novaConta.numeroConta = 45389;
		novaConta.saldo = 9489.00;
		
		// Imprimir os valores na tela
		
		
		System.out.println(novaConta.nome);
		System.out.println(novaConta.agencia);
		System.out.println(novaConta.cpf);
		System.out.println(novaConta.numeroConta);
		System.out.println(novaConta.saldo);

		Conta novaConta2 = null;
		System.out.println("Irah criar um objeto do tipo Conta");
		novaConta2 = new Conta ();
		novaConta2.nome = "Paula";
		novaConta2.agencia = 244;
		novaConta2.cpf = 12345633380l;
		novaConta2.numeroConta = 45370;
		novaConta2.saldo = 94.00;

		
		novaConta = null;
		//null pointer access
		//System.out.println(novaConta.nome);
		
		novaConta = novaConta2;
		
		System.out.println();
		
		System.out.println(novaConta2.nome);
		
		
		
		novaConta.nome = "Davi Lucas";
	
		System.out.println(novaConta2.nome);
		
		novaConta2 = null;
		
		
	}

}

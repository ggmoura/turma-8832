
public class CadastroConta {
	public static void main(String[] args) {
		Conta novaConta = new Conta();
		novaConta.nome = "Michelle";
		novaConta.agencia = 1315;
		novaConta.cpf = 00546265302l;
		novaConta.numeroConta = 303030;
		novaConta.saldo = 10000.00;
		
		System.out.println(novaConta.nome);
		System.out.println(novaConta.cpf);
		System.out.println(novaConta.numeroConta);
		System.out.println(novaConta.agencia);
		System.out.println(novaConta.saldo);
	}
}

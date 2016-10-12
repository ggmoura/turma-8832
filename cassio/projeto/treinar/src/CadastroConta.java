
public class CadastroConta {

	public static void main(String[] args) {
		Conta novaConta = new Conta();
		novaConta.nome = "Cássio";
		novaConta.agencia = 248;
		novaConta.cpf = 00546265302l;
		novaConta.numeroConta = 10481;
		novaConta.saldo = 10000.00;
		
		System.out.println("Seguem abaixo os dados de sua nova conta: \n");
		System.out.println("Nome: "+novaConta.nome);
		System.out.println("Agencia: "+novaConta.agencia);
		System.out.println("CPF: "+novaConta.cpf);
		System.out.println("Numero Conta: "+novaConta.numeroConta);
		System.out.println("Saldo: "+novaConta.saldo);
		
	}
}

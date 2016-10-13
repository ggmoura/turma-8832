package casp1;

public class ContaXGerente {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		conta1.numeroConta = 4564654;
		conta1.gerente = new Gerente();
		conta1.gerente.nomeGerente = "Maria do carmo";
		conta1.gerente.telefone = 325410102;

		System.out.println("Gerente " + conta1.gerente.nomeGerente);

	}
}

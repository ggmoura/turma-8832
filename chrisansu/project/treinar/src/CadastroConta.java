
public class CadastroConta {
	
	public static void main(String[] args) {
		
		/*
		Conta novaConta = null;
		novaConta = new Conta();
	
		novaConta.nome = "Chris";
		novaConta.agencia = 245;
		novaConta.cpf = 9872523873l;
		novaConta.numeroConta = 6647323;
		novaConta.saldo = 5000.9;
			
		System.out.println("Nome	: " + novaConta.nome);
		System.out.println("CPF	: " + novaConta.cpf);
		System.out.println("Agência	: " + novaConta.agencia);
		System.out.println("Conta	: " + novaConta.numeroConta);
		System.out.println("Saldo	: " + novaConta.saldo);
		
		System.out.println("\r\n");
		
		Conta novaConta2 = null;
		novaConta2 = new Conta();
		novaConta2.nome = "joao";
	
		Conta novaConta3 = new Conta();
		novaConta3.nome = "maria";
		
		System.out.println("Nome: " + novaConta.nome);
		System.out.println("Nome: " + novaConta2.nome);
		System.out.println("Nome: " + novaConta3.nome);
		
		
		*/
		
		//int valor1 = 10;
		//int valor2 = 10;
		
		
		Conta valor2 = new Conta();
		Conta valor1 = new Conta();
		
		valor1.nome = "carlos";
		
		valor2.nome = "carlos";
		
		System.out.println("Comparação: " + (valor1 == valor2));
		
		valor1 = valor2;
		
		System.out.println("Comparação: " + (valor1 == valor2));
	}
}

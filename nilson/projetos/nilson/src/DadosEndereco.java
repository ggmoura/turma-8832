
public class DadosEndereco {

	public static void main(String[] args) {
		
		Endereco de  = new Endereco();
		de.cep       = new Cep();
		
		de.nomeRua = "Avenida Afonso Pena";
		de.codAgencia = 4556; 
		de.numero = 999;
		de.cep.cep = 512959;
		
		System.out.println(" ----------    Endereco do Banco   ---------");
		System.out.println(" ===========================================");
		System.out.println(" Nome da rua      : " + de.nomeRua);
		System.out.println(" Código da Agencia: " + de.codAgencia);
		System.out.println(" Numero           : " + de.numero);
		System.out.println(" Cep              : " + de.cep.cep);
	}

}

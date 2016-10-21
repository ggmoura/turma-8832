
public class AtividadeEquals {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		Veiculo veiculo1 = new Veiculo();
			
		veiculo.nome = "Siena";
		veiculo1.nome = "Siena";

		Veiculo veiculo2 = veiculo1;
		
		System.out.println(veiculo.equals(veiculo1));
		System.out.println(veiculo == veiculo1);
		System.out.println(veiculo == veiculo2);
		System.out.println(veiculo.equals(veiculo2));
	
		
//		Como o metodo equals implementado na classe veiculo o resultado e:
//			true
//			false
//			false
//			true
//		Ja sem a implementacao do metodo equal na classe veiculo o resultado e:
//			false
//			false
//			false
//			false
		
	}
}

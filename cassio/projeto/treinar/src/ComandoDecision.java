
public class ComandoDecision {

	public static void main(String[] args) {
		
		int a = 10, b = 10;
		
		if (a == b) {
	
			System.out.println("A é igual a b ");
		}else
			System.out.println("Pagar IPTU");
			System.out.println("Pagar Boleto");//sem chaves apenas a primeira linha é impressa, essa segunda é  desprezada pelo if
		
		System.out.println("fim...");
	}
}

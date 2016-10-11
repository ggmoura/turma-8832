
public class OperadorBitwise {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		boolean resultado = a == 10 && b == 20;
		System.out.println(resultado);
		
		resultado = (a == 11 && (b == 20 || a == 20));
				System.out.println(resultado); // !resultado = inverte o resultado.
											   // != diferente.
				
				
	}
}

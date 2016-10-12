
public class OperadorLogico1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean resultado = a == 10 && b == 20;
		System.out.println(resultado);
		
		resultado = a == 1 || b == 2;
		System.out.println(resultado);
		
		resultado = (a == 11 && (b == 20 || a == 20));
		System.out.println(resultado);
		
		resultado = a != b; //diferente
		System.out.println(!resultado);

		resultado = a > b;
		System.out.println(!resultado); // o ! nega o valor do resultado
	}
}

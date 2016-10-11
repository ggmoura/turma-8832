

public class OperadorLogical {

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		boolean resultado = a == 11 && b == 20;
		System.out.println(resultado);
		
		resultado = a == 1 || b == 2;
		System.out.println(resultado);
		
		resultado = (a == 11 && (b == 20 || a == 20));
		System.out.println(resultado);
		
		resultado = a != b;//Diferente
		System.out.println(!resultado);
		
		resultado = a > b;//Nega o valor de resultado
		System.out.println(!resultado);
		
	}
	
}

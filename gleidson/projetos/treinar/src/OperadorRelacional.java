
public class OperadorRelacional {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean aIgualB = a == b;
		
		System.out.println(aIgualB);
		
		boolean aDiferenteB = a != b;
		System.out.println(aDiferenteB);
		
		boolean aMaiorB = a > b;
		System.out.println(aMaiorB);
		
		boolean aMenorB = a < b;
		System.out.println(aMenorB);
		
		boolean aMaiorIgualB = a >= b;
		System.out.println(aMaiorIgualB);
		
		boolean aMenorIgualB = a <= b;
		System.out.println(aMenorIgualB);
	}
	
}

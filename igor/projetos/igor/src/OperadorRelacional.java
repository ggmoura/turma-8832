
public class OperadorRelacional {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean aIgualB = a ==b;
		System.out.println("a igual b " + aIgualB);
		
		boolean aDiferenteB = a != b;
		System.out.println("a diferente b " + aDiferenteB);
		
		boolean aMaiorB = a > b;
		System.out.println("a maior b " + aMaiorB);
		
		boolean aMaiorIgualB = a>= b;
		System.out.println("a maior igual b " + aMaiorIgualB);
		
		boolean aMenorB = a < b;
		System.out.println("a menor b " + aMenorB);
		
		boolean aMenorIgualB = a <= b;
		System.out.println("a menor igual b " + aMenorIgualB);
		
	}

}

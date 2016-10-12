
public class OperadorAritmetico {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		int somaAMaisB = a + b;
		System.out.println(somaAMaisB);
		
		int subtracaoAmenosB = a - b;
		System.out.println(subtracaoAmenosB);
		
		int divisaoAporB = a / b;
		System.out.println(divisaoAporB);
		
		int multiplicacaoAporB = a * b;
		System.out.println(multiplicacaoAporB);
		
		double divisaoAporBDouble = a / (double) b;
		System.out.println(divisaoAporBDouble);
			
		a = a + 10; //17
		System.out.println(a);
		
		a += 10;//27
		System.out.println(a);
	
		int i = 0;
		System.out.println(i);
		i++;
		System.out.println(i);
	}
}

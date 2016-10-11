
public class OperadorAritimetico {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		int somaAMaisB = a + b;
		System.out.println(somaAMaisB);
		
		int subtracaoAMenosB = a - b;
		System.out.println(subtracaoAMenosB);
		
		int divisaoAPorB = a / b;
		System.out.println(divisaoAPorB);
		
		int multiplicacaoAPorB = a * b;
		System.out.println(multiplicacaoAPorB);

		double divisaoAPorBDouble = (double) a /  b;
		System.out.println(divisaoAPorBDouble);
		
		int modulo = a % b;
		System.out.println(modulo);
		
		a = a + 10;//17
		System.out.println(a);
		
		a += 10;//
		System.out.println(a);
		
		int i = 0;
		System.out.println(i);
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		
	}
	
}

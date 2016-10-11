
public class Operador {
	public static void main(String[] args)  {
		int a = 7;
		int b = 3;
		
		int somaAMaisB = a + b;
		System.out.println(somaAMaisB);
		
		int subtracaoAMenosB = a - b;
		System.out.println(subtracaoAMenosB);
		
		int divisaoAPorB = a / b;
		System.out.println(divisaoAPorB);

		int multiplicaAPorB = a * b;
		System.out.println(multiplicaAPorB);

		

		a = a + 10; //17
		System.out.println(a);
		a += 10; //27
		System.out.println(a);
		
		int i = 0;
		i = i +1;
		System.out.println(i);

		i ++;
		System.out.println(i);

		System.out.println(i++); //pós incremento - primeiro atribui o valor da variável depois incrementa o valor
		System.out.println(++i); //pré incremento - primeiro incrementa depois atribui o valor da variável
		
	}
	
}

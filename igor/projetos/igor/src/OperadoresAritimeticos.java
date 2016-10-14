
public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		int somaAMaisB = a + b;
		System.out.println(somaAMaisB);
		
		int subtracaoAMenosB = a - b;
		System.out.println(subtracaoAMenosB);
		
		int divisaoAporB = a / b;  					//O tipo de dados dos operandos determina o tipo de dados do resultado
		System.out.println(divisaoAporB);
		double divisaoAporBFloat = a / b;  			//Mesmo a variavel de resultado sendo float o valor será inteiro 
		System.out.println(divisaoAporBFloat);
		double divisaoAporBFloat2 = (double) a / b;  //Para realizar a conta podemos informar para o codigo interpretar um dos operadores de outra forma
		System.out.println(divisaoAporBFloat2);
		
		int modulo = a % b;							// O modulo "%" extrai apemas o resto da divisao
		System.out.println(modulo);
		
		a = a +10;									//incrementando valor 
		System.out.println(a);
		a += 10;									//incrementando valor
		System.out.println(a);

		System.out.println("incremento pre");
		
		int i = 0;									//incrementa valor de 1 a 1 - pos incremento - executa apos o comando
		i++;
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		
		i--;										//regressiva de 1 em 1
		System.out.println(i);
		System.out.println(i--);
		System.out.println(i);
		
		//incrementa valor de 1 a 1 - pre incremento - executa primeiro o comando de incre
		System.out.println("incremento pos");
		++i;
		System.out.println(i);
		System.out.println(++i);
		
		--i;										//regressiva de 1 em 1
		System.out.println(i);
		System.out.println(--i);
		
	}

}

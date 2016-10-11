
public class Racional {
	public static void main(String[] args) {
		int a = 10, b = 20, c = 15;
		
		boolean igual = a == b;
		boolean diferente = a != b;
		boolean maior = a > b;  
		boolean menor = a < b && a < c;
		boolean maiorIgual = a >= b;
		boolean menorIgual = a <= b;
		
		System.out.println(igual);
		System.out.println(diferente);
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(maiorIgual);
		System.out.println(menorIgual);
		
	}

}

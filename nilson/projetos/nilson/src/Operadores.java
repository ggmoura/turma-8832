
public class Operadores {
     public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 20;
		int somaAmaisB    = a + b;
		int somaBmenosA   = b - a;
		int divisaoBporA  = b / a;
		System.out.println("somaAmaisB   = " + somaAmaisB);
		System.out.println("somaBmenosA  = " + somaBmenosA);
		System.out.println("divisaoBporA = " + divisaoBporA);
		System.out.println("divisaoBporA = " + divisaoBporA);
		a = c + 10;
		System.out.println("a                    = " + a);
        c++;
		System.out.println("c com pós incremento = " + c);
		c+=10;
		System.out.println("c                    = " + c);
		c--;
		System.out.println("c                    = " + c);
     }  
}

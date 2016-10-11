
public class OperadorBitwise {
     public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		boolean resultado1 = a == 10 && b == 20;
		System.out.println("resultado1 = " + resultado1);
		boolean resultado2 = a == 11 && b == 20;
		System.out.println("resultado2 = " + resultado2);
		boolean resultado3 = a == 10 || b == 20;
		System.out.println("resultado3 = " + resultado3);
		boolean resultado4 = a == 10 || b == 19;
		System.out.println("resultado4 = " + resultado4);
		boolean resultado5 = a == 11 || b == 20;
		System.out.println("resultado5 = " + resultado5);
		boolean resultado6 = a == 11 || b == 21;
		System.out.println("resultado6 = " + resultado6);
		boolean resultado7 = (a == 10 && ( a == 11 || b == 21 ));
		System.out.println("resultado7 = " + resultado7);
		boolean resultado8 = a != b;
		System.out.println("resultado8 = " + resultado8);
		boolean resultado9 = a > b;
		System.out.println("resultado9 = " + resultado9);
	}
}

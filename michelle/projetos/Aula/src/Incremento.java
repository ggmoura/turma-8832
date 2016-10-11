
public class Incremento {
		public static void main(String[] args) {
			int a =100;
			a = a+10;
			System.out.println(a);
			
			a+= 10;
			System.out.println(a);
			
			int i = 0;
			i++;
			System.out.println(i);
			i--;
			System.out.println(i);
			
//			int soma = 1 +  2;
//			System.out.println(soma);
//			pós incremento : primeiro incrementa para depois atribuir o valor
			
			int a1 = 0;
			System.out.println(a1);
			a1 = a1 + 1;
			System.out.println(a1);
			a1++;
			System.out.println(a1);
			System.out.println(a1++);
		
//		pre incremento: primeiro atribui o valor para depois incrementar
			int incremento =++a1;
			System.out.println(incremento);
		
		
		}
}

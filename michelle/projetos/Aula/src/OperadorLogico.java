

public class OperadorLogico {
		public static void main(String[] args) {
			int a = 1;
			int b = 2;
			
			boolean resultado = a == 1 && b==2;// representa o and
			System.out.println(resultado);
			
			resultado = a == 10 || b == 20; //representa o ou
			System.out.println(resultado);
			
			resultado = a == 10 && (b == 20 && a == 1) ; //muda a prioridade do calculo, vira o ()
			System.out.println(resultado);
			
			resultado = a < b; //nega o valor do resultado
			System.out.println(!resultado);
			
			resultado = a != b; // diferente
			System.out.println(resultado);
			
//			
}
}

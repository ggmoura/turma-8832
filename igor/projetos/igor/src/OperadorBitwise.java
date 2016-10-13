
public class OperadorBitwise {

		public static void main(String[] args) {
			int a = 10;
			int b = 20;
			
			boolean resultado = a  == 10 && b == 20;					// se a = 10 e b = 20
			System.out.println(resultado);

			resultado = a  == 1 || b == 2;								// se a = 1 ou b = 2
			System.out.println(resultado);

			resultado = (a  == 10 && (a  == 1  || b == 2));				// se a = 10 e (a=1  ou b = 2)
			System.out.println(resultado);

			resultado = !(a  == 1 || b == 2);							// se nao for (a = 1 ou b = 2)
			System.out.println(resultado);
			
			resultado = !(a  == 1 || b == 2);							// Nega o valor do resultado
			System.out.println(!resultado);


		}
}

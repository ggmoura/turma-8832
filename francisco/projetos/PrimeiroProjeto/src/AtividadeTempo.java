
public class AtividadeTempo {
	public static void main(String[] args)  {
		int a = 100;
		int b = 60;		
	
		int divisaoAPorB = a / b;
		System.out.println(divisaoAPorB);
		
		int modulo = a % b;
		System.out.println(modulo); // É o resto da divisão
		
		System.out.println(divisaoAPorB +":"+  modulo);

		int tempo = 1000;
		int hora = tempo / 60;
		int minuto = tempo % 60;
		System.out.println(hora +":"+ minuto);
	}

}


public class TipoDados {
	public static void main(String[] args) {
		
		byte times = 20;
		short estadios = 20;
		int jogadores = 600;
		long torcedores = 10000000;
		float ingresso = (float) 45.50;
		double valorMedio = 22.75;
		boolean sim = true;
		char a = 'A';
		char literal = '\t';
		
		System.out.println("Quantidade de times:"+ times);
		System.out.println("Quantidade de estadios:"+ estadios);
		System.out.println("Quantidade de jogadores:"+ jogadores);
		System.out.println("Quantidade de torcedores:"+ torcedores);
		System.out.println("Valor do ingresso:"+ ingresso);
		System.out.println("Valor medio do ingresso:"+ valorMedio);
		System.out.println("Hoje te jogo?" + literal + sim);
		System.out.println("char a = " + a);
		System.out.println("char literal = " + literal + literal + a);
	}
}

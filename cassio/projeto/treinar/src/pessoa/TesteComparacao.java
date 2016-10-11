package pessoa;


public class TesteComparacao {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "José";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "José";
		
		System.out.println(p1 == p2); // falso porque apesar do mesmo valor, as referencias de memoria sao diferentes
		
		p1 = p2; // p2 passa a apontar para o mesmo local de p1
		System.out.println(p1 == p2); // agora imprimira true, pois os dois apontam para o mesmo local
	}
}

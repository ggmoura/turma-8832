
public class NumeroPar {

	public static void main(String[] args) {
		int resto = 0, sequencia = 0;
		
		while (sequencia < 100);
			++sequencia;
			resto = sequencia % 2;
			if (resto == 0) {
				System.out.println("Par  : " + sequencia);
			} else {
				System.out.println("Impar: " + sequencia);
			}
		
		// outra opção de solucao
		String mensagem = "";
		
		while (sequencia < 200) {
			mensagem = ++sequencia % 2 == 0 ? "Par:" + sequencia : "Impar" + sequencia;
			System.out.println(mensagem);
		}
		System.out.println("======= FINAL ======");
		// comando do while ele argumenta ao final do codigo, a sua execução sempre ocorre
		
		resto = 0;
		
		do {
			System.out.println("Resultado final " + resto);
		} while (resto > 0);
	}
}


public class AtividadeDecision {

	public static void main(String[] args) {
		int media = 60, nota = 59, premio = 99;

		if (nota >= media && nota >= premio) {
			System.out.println("aluno aprovado com premio de desconto");
		} else if (nota >= media) {
			System.out.println("aluno aprovado");
		} else
			System.out.println("foi pro saco");
	}
}

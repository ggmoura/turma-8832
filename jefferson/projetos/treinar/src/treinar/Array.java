package treinar;

public class Array {
	static void imprimir(String... values) {
		for (int i = 0; i < values.length; i++) {
			imprimir(values[i]);
		}
	}

	public static void main(String[] args) {
		String[] nome = new String[5];

		nome[0] = "Jefferson";
		nome[1] = "Fernande";
		nome[2] = "Julia";
		nome[3] = "Caroline";
		nome[4] = "Oliveira";

		String[] nomes = new String[5];

		for (int i = 0; i < nome.length; i++) {
			nomes[i] = nome[i];
		}

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}

	}

	private static void imprimir(String value) {

		System.out.println(value);
	}
}

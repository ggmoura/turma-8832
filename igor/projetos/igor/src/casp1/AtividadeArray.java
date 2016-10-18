package casp1;

public class AtividadeArray {

	static void imprimir(String... values) {
		for (int i = 0; i < values.length; i++) {
			imprimir(values[i]);
		}
	}

	static void imprimir(String value) {
		System.out.print(value + " ");
	}

	public static void main(String[] args) {

		String[] nome = new String[10];
		nome[0] = "josé maria";
		nome[1] = "ana carolina";
		nome[2] = "maria do carmo";

		String[] nome2 = new String[nome.length * 2];

		System.out.println("tamanho primeira tabela " + nome.length + " nome segunda tabela " + nome2.length);
		for (int i = 0; i < nome.length; i++) {
			nome2[i] = nome[i];
			imprimir("Tabela original");
			imprimir(nome[1]);
		}

		for (int i = 0; i < nome.length; i++) {
			if (nome[i] != null) {
				// * System.out.println("nome1 " + nome[i] + " nome2 " + nome2[i]);
				imprimir("Tabela copiada ");
				imprimir(nome2[i]);
			}
		}

	}

}

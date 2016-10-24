package casp1;

public class AtividadeExceptionArray {

	static String[] nomes = new String[10];

	static void imprimir(Integer values) throws Exception{
		String nome = nomes[values];
		for (int i = 0; i < values; i++) {
			System.out.println(nome);
		}
	}

	public static void main(String[] args) {
		String[] nome = new String[10];
		nome[0] = "josé maria";
		nome[1] = "ana carolina";
		nome[2] = "maria do carmo";


		try {
			imprimir(11);
		} catch (Exception e) {
			System.out.println("vc foi alem " + e.getMessage());
		}

	}

}

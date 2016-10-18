package casp1;

public class AtividadeArray {

	public static void main(String[] args) {
		System.out.println("Informe a quantidade de nomes necessários ");

		String[] nome, nome2;
		nome = new String[10];
		nome[0] = "josé maria";
		nome[1] = "ana carolina";
		nome[2] = "maria do carmo";
		nome2 = new String[nome.length * 2];

		System.out.println("tamanho primeira tabela " + nome.length + " nome segunda tabela " + nome2.length);
		for (int i = 0; i < nome.length; i++) {
			nome2[i] = nome[i];
		}
		
		for (int i = 0; i < nome.length; i++) {
			if (nome[i] != null) {
				System.out.println("nome1 " + nome[i] + " nome2 " + nome2[i]);
			
			}
		}
		
	}

}

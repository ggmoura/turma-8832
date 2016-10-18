package casp1;

import java.util.Scanner;

public class CadastroImovel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer tipoImovel = teclado.nextInt();
		teclado.close();
		TipoImovel[] tipoImoveis = TipoImovel.values();
		System.out.println("O imovel selecionado foi: " + "\t" + tipoImoveis[tipoImovel]);

	}

}

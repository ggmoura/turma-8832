package casp1;

import java.util.Scanner;

public class CadastroImovel {

	public static void main(String[] args) {
		System.out.print("Informe qual ordinal do imóvel: \t");
		Scanner teclado = new Scanner(System.in);
		Integer tipoImovel = teclado.nextInt();
		teclado.close();
		Sexo[] tipoImoveis = Sexo.values();
		System.out.println("O imóvel informado foi: " + "\t\t" + tipoImoveis[tipoImovel]);

	}

}

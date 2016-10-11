import java.util.Scanner;


public class Novo2 {
	public static void main(String[] args) {
		System.out.print("Digite a quantidade: ");
		
		Scanner leitor = new Scanner(System.in);
		int quantidade = leitor.nextInt();
		
		for (int comp = 0; comp < quantidade; comp++) {
		System.out.println(comp +" - Michelle");
		} 
		leitor.close();
	}
}

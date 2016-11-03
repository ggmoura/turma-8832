import java.util.Scanner;

public class AtividadeRepeticao {
	public static void main(String[] args) {
		System.out.print("Digite a quantidade: ");
		
		Scanner leitor = new Scanner(System.in);
		int quantidade = leitor.nextInt();
		int comp = 0;	
				
		while (comp  < quantidade) {
			System.out.println( "Michelle" );
			comp++;
		}
//		Do while
		comp = 0;
		do {
			if (quantidade != 0) {
				System.out.println("Michelle");	
			}		
			comp++;
		} while (comp < quantidade);
	
//		For
		for (int comp2 = 0; comp2 < quantidade; comp2++) {
//			(declaração de variaveis; condição de parada ; atualização de valor)
			System.out.println(comp +" - Michelle");
		} 
		
			
		leitor.close();
	}
	
		
}

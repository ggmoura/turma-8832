import java.util.Scanner;

public class JonneWalking {


	public void andar(Integer qtdepassos){
		for(int i = 0; i<qtdepassos; i++){
			andar(i);
		}	
	}
	
	
	public static void main(String[] args) {
		
		
		
		System.out.print("Informe quantos pasos deseja andar: ");
		Scanner leitor = new Scanner(System.in);
		int qtde = leitor.nextInt();
		leitor.close();
				
	}
}

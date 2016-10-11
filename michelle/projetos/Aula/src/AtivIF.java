
public class AtivIF {
	
	public static void main(String[] args) {
		int a = 5;
				
		if (a == 1){
			System.out.println("Um");
		} 
		else if(a == 2) {
				System.out.println("dois");
		} 
		else if (a == 3){
				System.out.println("tres");
		}
		else if (a == 4) {
			System.out.println("quatro");
			
		} else if (a == 5) {
			System.out.println("Cinco");
			
		}
		switch (a) { //só vale para inteiros ou string
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		default:
			System.out.println("invalido");
			break;
		
		}
// se o case nao encontrar o break ele vai imprimir ate encontrar o break.		
		
		
	}
		
				 
}


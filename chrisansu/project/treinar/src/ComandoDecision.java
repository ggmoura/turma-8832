public class ComandoDecision {
	public static void main(String[] args) {
		int a = 1;
	
		if (a == 1) {
			System.out.println("um if");
		} 
		else if(a == 2){
			System.out.println("dois if");
		}
		
		switch (a) {
		case 1:
			System.out.println("um switch");
			break;

		case 2:
			System.out.println("dois switch");
			break;
			
		default:
			System.out.println("inválido");
		}
	}
}

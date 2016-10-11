
public class OperadorRelacional {
	public static void main(String[] args) {
		
		int a = 45;
		int b = 30;
		
		boolean resultado = a ==11 && b == 30;
		System.out.println(resultado);
		
		resultado = a == 45 || b == 3;
		System.out.println(resultado);
		
		resultado = (a == 43 && (b==30 || a == 30));
		System.out.println(resultado);
		
		resultado = a > b; // ou a!=b nao pode ter <>
		System.out.println(resultado);
		
		
		if(a == b){
			
			System.out.println("a == b ");
		}
		else{
			System.out.println("a == b ");
		}
		
		
	}
}

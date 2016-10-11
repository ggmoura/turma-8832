
public class ComandoDeRepeticao {

	public static void main(String[] args) {
		
		int a =100;

		while(a < 50){
		
			//System.out.println(a +=2);
			
			/*
			if(++a % 2 == 0){
				System.out.println("eh par " + a);
			}
			else{
				System.out.println("eh imp " + a);
			}
			*/
		//System.out.println(++a % 2 == 0 ? "eh par "+ a : "eh imp " + a);
			
		}
		
		int b = 0 ;
		
		do {
			System.out.println(++b % 2 == 0 ? "eh par "+ b : "eh imp " + b);
		} while(++b < 50);
		
		
		
		
	}
}

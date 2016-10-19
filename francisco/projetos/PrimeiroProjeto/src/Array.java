
public class Array {

	static void imprimir(int... values) {
		for (int i = 0; i < values.length; i++) {
			imprimir(values[i]);
		}
	}

	static void imprimir(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		int[] idade = new int[10];
		idade[0] = 0;
		idade[1] = 10;
		idade[2] = 20;
		idade[3] = 30;
		idade[4] = 40;
		idade[5] = 50;
		idade[6] = 60;
		idade[7] = 70;
		idade[8] = 80;
		idade[9] = 90;
//		System.out.println(idade);
//		System.out.println("Tenho " + idade.length + " idades.");

		for (int i = 0; i < idade.length; i++) {
//			System.out.println(idade[i]);
		}

		int[] idade2 = new int[10];
		idade2[0] = 0;
		idade2[1] = 0;
		idade2[2] = 0;
		idade2[3] = 0;
		idade2[4] = 0;
		idade2[5] = 0;
		idade2[6] = 0;
		idade2[7] = 0;
		idade2[8] = 0;
		idade2[9] = 0;

		for (int i = 0; i < idade2.length; i++) {
			idade2[i] = idade[i] * 2;
//			System.out.println(idade2[i]);
		}

		imprimir(idade);
		
//		imprimir(30); 

	}
}

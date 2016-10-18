package br.com.treinar.estudo.array;

public class GoToFake {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		para:
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			naoPara:
			for (int j = 0; j < 20; j++) {
				System.out.println("j = : " + j);
				if (i * j == 10) {
					break para;
				}
			}
		}
	}
	
}

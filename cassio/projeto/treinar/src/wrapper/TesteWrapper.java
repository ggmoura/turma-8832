package wrapper;

public class TesteWrapper {

	public static void main(String[] args) {
		
		int idadePrimitivo1 = 0;
		int idadePrimitivo2 = 0;
		Integer idade = 5;
		System.out.println(idade);
		Integer idade2 = idade;
		idade = 6;
		System.out.println(idade2);
		System.out.println(idade);
		System.out.println(idadePrimitivo1);
		Integer idadeTres = 5;
		System.out.println(idadeTres);
		
		Integer cinco = new Integer(5);
		System.out.println(cinco);
		
		Integer miOld = 1000;
		Integer miNew = 1000;
		System.out.println(miNew);
		System.out.println(miOld);		
	}
}

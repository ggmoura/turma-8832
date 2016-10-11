
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
		
		Integer milNew = 1000;
		Integer milOld = 1000;
		System.out.println(milNew);
		System.out.println(milOld);
		
		idadePrimitivo1 = 10;
		idadePrimitivo2 = 10;
		
		System.out.println("comparação int: " + (idadePrimitivo1 == idadePrimitivo2));
		
		Integer idadeWrapper1 = 10;
		Integer idadeWrapper2 = 20;
		
		System.out.println("comparação int: " + (idadeWrapper1 == idadeWrapper2));
	}

}

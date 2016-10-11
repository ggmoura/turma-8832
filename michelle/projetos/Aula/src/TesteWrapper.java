
public class TesteWrapper {
public static void main(String[] args) {
	
	int idadePrimitivo = 0;
	Integer idade =5;
	System.out.println(idade);
	Integer idade2 = idade;
	
	idade =6;
	System.out.println(idade2);
	System.out.println(idade);
	System.out.println(idadePrimitivo);
	
	Integer cinco = new Integer(5);
	System.out.println(cinco);
	
	Integer milOld = 1000;
	Integer milNew = 1000;
	System.out.println(milNew);
	System.out.println(milOld);
	
	
	
}
}

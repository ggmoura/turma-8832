
public class Operador {
public static void main(String[] args) {
	int a = 21, b = 85, r = 60;
	int soma, adcao, multiplicacao, divicao;
	int tempo = 100;
	int modulo = tempo % r; //modulo, resto da divição.
	
	soma = a + b;
	adcao = b - a;
	multiplicacao = a * b;
	divicao = tempo / r;
	modulo = tempo % r;
	
	a = a + 10;
	a += 10;
	
	int i = 0;
	i = i + 1;
	
	//System.out.println(soma); //soma
	//System.out.println(adcao); //adicao
	//System.out.println(multiplicacao); //multiplicacao
	//System.out.println(divicao + " hora e " + modulo + " minutos" ); //modulo tempo
	//System.out.println(modulo); //modulo
	//System.out.println(a); //soma -1
	i--;
	//System.out.println(i); //soma +1 incremento
	i++;
	
	
	int incremento = i++; 
	System.out.println(++i); //Pre. Incrementa primeiro para depois atribuir o valo.
	System.out.println(incremento); //Pos. primeiro atribui o valor e depois incrementa.
}
}

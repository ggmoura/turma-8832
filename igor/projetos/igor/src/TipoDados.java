
public class TipoDados {

	public static void main(String[] args) {
		byte variavelBytes = -127;
		System.out.println("VALOR INICIAL " + variavelBytes);
		variavelBytes = 127;
		System.out.println("RECEBE NOVO VALOR " + variavelBytes);
		short peso = -32768;
		System.out.println("Potencia freio " + peso);
		peso = 32767;
		System.out.println("Arranque em peso " + peso);
		int tempoVendaSegundos = 2147483647;
		System.out.println("Tempo de Venda em segundos " + tempoVendaSegundos);
		long cicloMotor = 9223372036854775800l; //Necessario incluir l no final para identificar variavel long, padrao ate int
		System.out.println("Ciclo do motor " + cicloMotor);
		cicloMotor = 9223372_03685_4775800l; // O _ serve como separador apenas no fonte não no display
		System.out.println("Ciclo do motor com separador apenas interno" + cicloMotor);
		// Variaveis com ponto flutuante
		float preco = 0.99f; //necessario informar o f no final para indicar que é ponto flutuante
		System.out.println("Preço: " + preco);
		preco = (float) 1.99; // Outra forma de trabalhar com variavel de ponto flutuante
		System.out.println("Preço:" + preco);
		double valor = 0.99; //Quando trabalhamos com o tipo double não é necessario especificar o tipo
		System.out.println("Valor: " + valor);
		boolean automatico = true;
		System.out.println(automatico);
		// Variaveis literais
		char eficienciaEnergetica = 'F'; // char só representa um caracter 'Podendo ser caracteres representativos quebra de linha...
		System.out.println("Eficiencia Energetica " + eficienciaEnergetica);
		char caracterEspecia = '\''; // colocando a \ antes do caracter especial o JAVA interpreta ele como um texto
		char tabulacao = '\t';
		System.out.println("Caracter Especial " + tabulacao + caracterEspecia);
		
	}
}

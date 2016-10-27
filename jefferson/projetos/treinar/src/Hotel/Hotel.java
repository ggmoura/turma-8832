package Hotel;

import java.util.Scanner; // IMPORTANDO O SCANNER PARA ENTRADA DE DADOS 
public class Hotel 
{ 

public static class Cliente 
{ 
private String nome; 
private boolean disponivel; 

} 


public static void main(String args[]) 
{ 
Cliente hotel[]; 
hotel = new Cliente[20]; 
for (int i = 0; i<20; i++) 
{ 
hotel[i] = new Cliente(); 
} 
Scanner input = new Scanner(System.in); 
int i,v, opc; 
int quartos[] = new int[20]; 




do // laco de repeticao até o usuario escolher a opcao sair 
{ 

System.out.println("***************************************************************");// tela inicial de boas vindas 
System.out.println("***************************************************************");// tela inicial de boas vindas 
System.out.println("**********-----------HOTEL JAVA----------***********");// tela inicial de boas vindas 
System.out.println("***************************************************************");// tela inicial de boas vindas 
System.out.println("***************************************************************");// tela inicial de boas vindas 
System.out.println("");// tela inicial de boas vindas 
System.out.println("---------------------------------------------------------------");// tela inicial de boas vindas 
System.out.println(""); 
System.out.println(""); 
System.out.println("---------------------------------------------------------------"); 
System.out.println("1- CADASTRAR"); 
System.out.println("2- REMOVER"); 
System.out.println("3- REMOVER TODOS"); 
System.out.println("4- IMPRIMIR"); 
System.out.println("---------------------------------------------------------------"); 
System.out.println("5- Sair"); 
System.out.println("---------------------------------------------------------------"); 
System.out.println(""); 
System.out.println("Escolha a operacao desejada:"); 
opc = input.nextInt(); 


switch(opc) 
{ 

case 1: // opcao de cadastro de usuario 
System.out.println("Escolha o quarto"); 
i= input.nextInt(); 
if (i <20){ 

if (quartos[i]== 0) // caso o quarto esteja desocupado ... 
{ 

System.out.printf("Hospede registrado com sucesso no quarto %dn", i); // cadastro efetuado com sucesso 
quartos[i]= 1; // quarto esta agora ocupado 

}else 
{ 
System.out.println("Quarto Ocupado!"); // caso quarto ja esteja ocupado informe o usuario disso 
} 
}else{ 
System.out.println("Quarto Inexistente"); 
} 
break; 
case 2: 
System.out.println("Escolha o quarto"); // removendo usuario de um quarto 
i= input.nextInt(); 
if (quartos[i]== 0)// se o quarto estiver vazio 
{ 
System.out.printf("Quarto %d encontra-se vazio no momento!n", i); // informe que o quarto ja esta vazio e nao tem ninguem para ser removido 

}else // senao 
{ 
System.out.println("Hóspede removido do quarto com sucesso!"); // remova o hospedo do quarto 
quartos[i]= 0; // quarto agora esta vazio 
} 
break; 
case 3: 
System.out.println("Todos hóspedes removidos com sucesso"); // removendo toodos os hospedes de uma soh vez 
for(v=0;v<20;v++) 
{ 
quartos[v]= 0; // todos os quartos agora estao vazios 
} 
break; 
case 4: 
System.out.println("Listagem de quartos!"); // exibindo uma lista de todos os quartos.. c 
for (i=0;i<quartos.length;i++) 
{ 
if (quartos[i]==0) // verifica se esta vazio(o quarto) 
{ 
System.out.printf("Quarto: %d: ----Livren",i);// exibie quarto vazio 
}else 
{ 
System.out.printf("Quarto: %d: ----Ocupadon",i); // quarto ocupado 
} 
} 
break; 

default: 
System.out.println("Opcao invalida"); // tratando uma excessao 
} 



}while(opc!=5); // ate o usuario escolher a opcao 5 - sair 
} 

}
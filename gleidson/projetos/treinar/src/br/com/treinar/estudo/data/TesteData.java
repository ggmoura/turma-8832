package br.com.treinar.estudo.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 30);
		System.out.println(calendar.getTime());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a data de nascimento: ");
		String dataNascimento = sc.nextLine();
		sc.close();
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		Date dataInformada = formatador.parse(dataNascimento);
		
		System.out.println(dataInformada);
		
	}
	
}

package br.com.treinar.estudo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class AtividadeLerNomes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		List<String> nomes = lerArquivo();
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("\n");
		String nome = "";
		nomes.clear();
		do {
			System.out.print("Informe o nome ou escreva [sair] para finalizar: ");
			nome = leitor.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				nomes.add(nome.toUpperCase());
			}
		} while (!nome.equalsIgnoreCase("sair"));
		leitor.close();
		gravarArquivoOrdenado(nomes);
		System.out.println("fim do programa!");
	}
	
	public static List<String> lerArquivo() {
		List<String> nomes = new ArrayList<String>();
		try {
			InputStream is = new FileInputStream("nomes.trn");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
			
			String nome = br.readLine(); // primeira linha
			while (nome != null) {
				nomes.add(nome);
				nome = br.readLine();
			}
			br.close();
			
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado...");
		}
		return nomes;
	}
	
	public static void gravarArquivoOrdenado(List<String> nomes) {
		//Collections.sort(nomes);
		try {
			OutputStream os = new FileOutputStream("nomes.trn", Boolean.TRUE);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			for (String nome : nomes) {
				bw.write(nome);
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			System.out.println("Erro ao gravar o arquivo...");
		}
	}
}

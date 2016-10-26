package br.com.treinar.estudo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	public static void main(String[] args) {

		try {
			InputStream is = LerArquivo.class.getClassLoader().getResourceAsStream(File.separator + "arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
			
			String linha = br.readLine(); // primeira linha
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado...");
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo...");
		}
	}

}

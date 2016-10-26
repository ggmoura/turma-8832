package fileio;

import java.io.*;
import java.util.Scanner;

public class TesteLerArquivo2 {
	
	public static void main(String[] args) {
		
		try {
			Scanner s = new Scanner(System.in);
			PrintStream ps = new PrintStream("arquivo2.txt");
			while (s.hasNextLine()) {
			  ps.println(s.nextLine());
			}
			ps.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo");
		}
		
	}

}

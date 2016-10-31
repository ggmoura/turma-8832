package lerarquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivo {

	public static void main(String[] args) {
		
		try {
			InputStream le = new FileInputStream("Teste"); //carrega o arquivo
			InputStreamReader leitor = new InputStreamReader(le);  //lê do arquivo
			BufferedReader lido = new BufferedReader(leitor); //gera um buffer com a linha do arquivo
			//System.out.println(lido.readLine());
			
			String linha = lido.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = lido.readLine();
			}
			lido.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado!");
		}catch (IOException e) {
			System.out.println("Problema ao ler o arquivo!");
		}
	}
}

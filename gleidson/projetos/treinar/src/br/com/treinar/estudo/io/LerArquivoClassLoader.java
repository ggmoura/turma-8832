package br.com.treinar.estudo.io;

import java.io.IOException;
import java.io.InputStream;


public class LerArquivoClassLoader {

	public static void main(String[] args) throws IOException {
		LerArquivoClassLoader teste = new LerArquivoClassLoader();
		teste.lerArquivo();
	}
	
	public void lerArquivo() throws IOException {
		InputStream file = getClass().getClassLoader().getResourceAsStream("br/com/treinar/estudo/io/noPacote.txt");
		System.out.println((char)file.read());
	}

}

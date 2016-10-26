package fileio;

import java.io.*;

public class TesteLerArquivo {

	public static void main(String[] args) throws IOException {

		try {
			InputStream is        = new FileInputStream("arquivo.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br     = new BufferedReader(isr);
			System.out.println(br.readLine());
			String linha = br.readLine();

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao ler arquivo");
		}

	}
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Scanner;

public class AtividadeIoGravarArquivo {

	public static void main(String[] args) throws Exception {
		Scanner leitor = new Scanner(System.in);
		List<String> nomes = lerArquivo();
		for (String nome : nomes) {
			System.out.println(nome);
		}
		String nome = "";
		do {
			System.out.print("\n\nInforme o nome ou escreva [sair] para finalizar: ");
			nome = leitor.nextLine();
			if (!nome.equalsIgnoreCase("sair")) {
				nomes.add(nome);
			}
			leitor.close();
		} while (nome.equalsIgnoreCase("sair"));
		gravarArquivoOrdenado(nomes);
		System.out.println("fim do programa!");
	}
	
	
	public static List<String> lerArquivo() {
		
		try {
			InputStream is = new FileInputStream ("saida.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
			
			String linha = br.readLine(); //primeira linha
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado ...");
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo...");
		}
		
	
		return null;
	}
	
	public static List<String> gravarArquivoOrdenado(List<String> nomes) throws IOException {
		OutputStream os = new FileOutputStream("saida.txt", Boolean.TRUE);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.newLine();
		bw.write(nomes);

		bw.close();
		
		return null;
	}
	
}

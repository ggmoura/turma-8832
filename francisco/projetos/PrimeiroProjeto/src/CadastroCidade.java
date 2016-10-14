
public class CadastroCidade {
	
	public static void main(String[] args) {
		
		Cidade novaCidade = new Cidade ();
		System.out.println("Irah criar um objeto do tipo Cidade");
	//	novaCidade = new Cidade ();
		novaCidade.nomeCid = "Belo Horizonte";
		
		Estado novoEstado = new Estado ();
	//	novoEstado = new Estado ();
		novoEstado.codEst = 1;
		novoEstado.nomeEst = "MG";
		
		System.out.println("Cidade: " + novaCidade.nomeCid + "-" + novoEstado.nomeEst);
		
		novaCidade.estado = novoEstado;
		
		System.out.println("Estado: " + novaCidade.estado.nomeEst + "-" + novaCidade.estado.codEst);
		
	}
	
}

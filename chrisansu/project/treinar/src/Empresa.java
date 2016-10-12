import com.sun.java.swing.plaf.windows.resources.windows;

public class Empresa {

	public static void main(String[] args) {
		
		//estancio funcionario
		Funcionario novoFuncionario = new Funcionario();
		novoFuncionario.codigo = 77;
		novoFuncionario.nome = "Chris";
		
		//estacio setor
		novoFuncionario.setor = new Setor();
		novoFuncionario.setor.descricao = "Sala";
		novoFuncionario.setor.setor = 89;
		//estancio funcao
		novoFuncionario.funcaoFuncionario = new Funcao();
		novoFuncionario.funcaoFuncionario.nomeFuncaoFuncionario = "programador";
		novoFuncionario.funcaoFuncionario.funcaoFuncionario = 76;
		
		System.out.println("Cód Funcionario	: " + novoFuncionario.codigo +
						   "\r\nNome Funcionario: " + novoFuncionario.nome +
						   "\r\nSetor		: "+ novoFuncionario.setor.descricao +
						   "\r\nCodigo Setor	: "+ novoFuncionario.setor.setor +
						   "\r\nFuncao		: " + novoFuncionario.funcaoFuncionario.nomeFuncaoFuncionario +
						   "\r\nCódigo Função	: " + novoFuncionario.funcaoFuncionario.funcaoFuncionario);
		
		
	
	}
}

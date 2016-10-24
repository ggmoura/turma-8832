package br.com.treinar.estudo.exception;

public class PagamentoContaException {

	public static void main(String[] args) {
		PagamentoContaException pge = new PagamentoContaException();
		pge.chefeMandarPagarConta();
		System.out.println("Fim do programa...");
	}
	
	public void chefeMandarPagarConta() {
		System.out.println("Chefe");
		try {
			secretariaPagarConta();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public void secretariaPagarConta() throws Exception {
		System.out.println("Secretaria");
		motoboyPagarConta();
	}
	
	public void motoboyPagarConta() throws Exception {
		System.out.println("Motoboy");
		Integer i = null;
		if (i == null) {
			Exception e = new Exception("i == null");
			throw e;
		}
		i++;
	}
	
}

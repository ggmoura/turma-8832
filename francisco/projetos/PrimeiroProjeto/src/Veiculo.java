
public class Veiculo {

	public String nome;
	public String cor;
	
	@Override
	public String toString() {
		return nome + "\r\n" + cor;
//		return "Veiculo [nome=" + nome + ", cor=" + cor + "]"; PADRAO GERADO PELO ATALHO
	}
	
	

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null) {
//			return false;
//		}
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		Veiculo other = (Veiculo) obj;
//		if (nome == null) {
//			if (other.nome != null) {
//				return false;
//			}
//		} else if (!nome.equals(other.nome)) {
//			return false;
//		}
//		if (cor == null) {
//			if (other.cor != null) {
//				return false;
//			}
//		} else if (!cor.equals(other.cor)) {
//			return false;
//		}
//		return true;
//	}

	
	
	
	}
package Comparacao;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class Carro {
	String nome;
	String cor;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", cor=" + cor + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		Carro c = (Carro) obj;
//		
//		return nome.equals(c.nome);
//	}
	
	
	
}


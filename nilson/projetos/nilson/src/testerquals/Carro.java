package testerquals;

public class Carro {
	
	String marca;
	String modelo;
	String cor;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Carro)) {
			return false;
		}
		Carro other = (Carro) obj;
		if (cor == null) {
			if (other.cor != null) {
				return false;
			}
		} else if (!cor.equals(other.cor)) {
			return false;
		}
		if (marca == null) {
			if (other.marca != null) {
				return false;
			}
		} else if (!marca.equals(other.marca)) {
			return false;
		}
		if (modelo == null) {
			if (other.modelo != null) {
				return false;
			}
		} else if (!modelo.equals(other.modelo)) {
			return false;
		}
		return true;
	}

}

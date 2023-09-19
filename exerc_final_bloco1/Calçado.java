package exerc_final_bloco1;

public abstract class Calçado {
	
	public String M_F;
	public String Exterior;
	public String Solado;
	public String Interior;
	public String Palmilha;
	public String Cor;
	public int Tamanho;
	
	public Calçado (String M_F, String Exterior, String Solado, String Interior, String Palmilha, int Tamanho, String Cor) {
		
		this.M_F = M_F;
		this.Exterior = Exterior;
		this.Solado = Solado;
		this.Interior = Interior;
		this.Palmilha = Palmilha;
		this.Tamanho = Tamanho;
		this.Cor =  Cor;
	
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}


	public String getM_F() {
		return M_F;
	}

	public void setM_F(String m_F) {
		M_F = m_F;
	}

	public String getExterior() {
		return Exterior;
	}

	public void setExterior(String exterior) {
		Exterior = exterior;
	}

	public String getSolado() {
		return Solado;
	}

	public void setSolado(String solado) {
		Solado = solado;
	}

	public String getInterior() {
		return Interior;
	}

	public void setInterior(String interior) {
		Interior = interior;
	}

	public String getPalmilha() {
		return Palmilha;
	}

	public void setPalmilha(String palmilha) {
		Palmilha = palmilha;
	}

	public int getTamanho() {
		return Tamanho;
	}

	public void setTamanho(int tamanho) {
		Tamanho = tamanho;
	}
}




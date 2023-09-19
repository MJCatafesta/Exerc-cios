package exerc_final_bloco1;

public class Mocassim extends Calçado{

	public String Salto;
	public String Cadarço;
	
	public Mocassim(String M_F, String Exterior, String Solado, String Interior, String Palmilha, int Tamanho,
			String Cor, String Salto, String Cadarço) {
		super (M_F, Exterior, Solado, Interior, Palmilha, Tamanho, Cor);
		
		this.Salto = Salto;
		this.Cadarço = Cadarço;
	}

	public String getSalto() {
		return Salto;
	}

	public void setSalto(String salto) {
		Salto = salto;
	}

	public String getCadarço() {
		return Cadarço;
	}

	public void setCadarço(String cadarço) {
		Cadarço = cadarço;
	}
	

}

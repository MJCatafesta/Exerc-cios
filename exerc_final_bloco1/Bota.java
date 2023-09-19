package exerc_final_bloco1;

public class Bota extends Calçado{
	
	public int tamanhoCano;
    public String cadarço;
    public Bota (String M_F, String Exterior, String Solado, String Interior, String Palmilha, int Tamanho, String Cor, int tamanhoCano, String cadarço) {
	super (M_F, Exterior, Solado, Interior, Palmilha, Tamanho, Cor);
	this.tamanhoCano = tamanhoCano;
	this.cadarço = cadarço;
}
	public int getTamanhoCano() {
		return tamanhoCano;
	}
	public void setTamanhoCano(int tamanhoCano) {
		this.tamanhoCano = tamanhoCano;
	}
	public String getCadarço() {
		return cadarço;
	}
	public void setCadarço(String cadarço) {
		this.cadarço = cadarço;
	}
}

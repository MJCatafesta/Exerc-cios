package exerc_final_bloco1;

public class SapatoSocial extends Calçado{
public String Brogue;
public String Cadarço;
public String Bico;

public SapatoSocial (String M_F, String Exterior, String Solado, String Interior, String Palmilha, int Tamanho, String Cor, String Brogue, String Cadarço, String Bico){ 
	super (M_F, Exterior, Solado, Interior, Palmilha, Tamanho, Cor);
	this.Brogue = Brogue;
	this.Cadarço = Cadarço;
	this.Bico = Bico;
}

public String getBrogue() {
	return Brogue;
}

public void setBrogue(String brogue) {
	Brogue = brogue;
}

public String getCadarço() {
	return Cadarço;
}

public void setCadarço(String cadarço) {
	Cadarço = cadarço;
}

public String getBico() {
	return Bico;
}

public void setBico(String bico) {
	Bico = bico;
}
}

package AulaGeneration;

public class Farmacia {
	private String nome;
	private String localizacao;
	private String horarioFuncionamento;
	private String ecommerce;
	private String delivery;
	
	public void vizualiza() {
		System.out.println("Nome: " + getNome() + "\nLocalização: " + getLocalizacao() + "\nHorário de funcionamento: " + getHorarioFuncionamento() + "\nE-commerce: " + getEcommerce() + "\nDelivery: " + getDelivery());
	}
	public Farmacia (String nome, String localizacao, String horarioFuncionamento, String ecommerce, String delivery) {
		this.nome = nome;
		this.localizacao = localizacao;
		this.horarioFuncionamento = horarioFuncionamento;
		this.ecommerce = ecommerce;
		this.delivery = delivery;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	public String getEcommerce() {
		return ecommerce;
	}
	public void setEcommerce(String ecommerce) {
		this.ecommerce = ecommerce;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	
	}


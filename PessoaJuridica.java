package AulaGeneration;

public class PessoaJuridica extends ClasseCliente {
	private String tipo;
	private int numeroMembros;
	
	public PessoaJuridica(String nome, String nacionalidade, int idade, String tipoConta, String estadoCivil, String tipo, int numeroMembros) {
	super (nome, nacionalidade, idade, tipoConta, estadoCivil);
	this.tipo = tipo;
	this.numeroMembros = numeroMembros;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroMembros() {
		return numeroMembros;
	}

	public void setNumeroMembros(int numeroMembros) {
		this.numeroMembros = numeroMembros;
	}
	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("Dados da pessoa jurídica: ");
		System.out.println("Tipo: " + this.tipo + "\n");
		System.out.println("Número de membros da " + this.tipo + ": " + this.numeroMembros + "\n");
 }
 
}

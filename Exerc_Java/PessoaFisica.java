package AulaGeneration;


public class PessoaFisica extends ClasseCliente {
	private String cpf;
	private String empregado;
	
	public PessoaFisica (String nome, String nacionalidade, int idade, String tipoConta, String estadoCivil, String cpf, String empregado) {
	super (nome, nacionalidade, idade, tipoConta, estadoCivil);
	this.cpf = cpf;
	this.empregado = empregado;

}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String isEmpregado() {
		return empregado;
	}

	public void setEmpregado(String empregado) {
		this.empregado = empregado;
	}
	@Override
	public void visualizar() {

		super.visualizar();
		System.out.println("Dados da pessoa Física: ");
		System.out.println("CPF: " + this.cpf + "\n");
		System.out.println("Está empregado? " + this.empregado + "\n");
		
	}
}
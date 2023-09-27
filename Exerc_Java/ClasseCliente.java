package AulaGeneration;

public class ClasseCliente {
private String nome;
private String nacionalidade;
private int idade;
private String tipoConta;
private String estadoCivil;

public void vizualiza() {
	System.out.println("O nome do cliente é " + getNome() + "\nNacionalidade: " + getNacionalidade() + "\nIdade: " + getIdade() + "\nTipo de conta: " + getTipoConta() + "\nEstado civil: " + getEstadoCivil());
}

public ClasseCliente (String nome, String nacionalidade, int idade, String tipoConta, String estadoCivil) {
	this.nome = nome;
	this.nacionalidade = nacionalidade;
	this.idade = idade;
	this.tipoConta = tipoConta;
	this.estadoCivil = estadoCivil;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNacionalidade() {
	return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getTipoConta() {
	return tipoConta;
}
public void setTipoConta(String tipoConta) {
	this.tipoConta = tipoConta;
}
public String getEstadoCivil() {
	return estadoCivil;
}
public void setEstadoCivil(String estadoCivil) {
	this.estadoCivil = estadoCivil;
}
public void visualizar() {
	System.out.println("\n\n************************************************************");
	System.out.println("Dados do Cliente:");
	System.out.println("****************************************************************");
	System.out.println("Nome: " + this.nome + "\n");
	System.out.println("Nacionalidade: " + this.nacionalidade + "\n");
	System.out.println("Idade: " + this.idade + "\n");
	System.out.println("Tipo de conta: " + this.tipoConta + "\n");
	System.out.println("Estado Civil: " + this.estadoCivil + "\n");
	 
}


}

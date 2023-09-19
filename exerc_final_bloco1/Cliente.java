package exerc_final_bloco1;

public class Cliente {
	public String nome;
	public String idade;
	public String cpf;
	
	
	public Cliente (String nome, String idade, String cpf) {
		
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	public Cliente () { }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

package AulaGeneration;

public class TesteCliente {

	public static void main(String[] args) {
		PessoaJuridica cliente1 = new PessoaJuridica ("Mike", "Brasileiro", 32, "Premium", "Casado", "empresa", 54);
		PessoaJuridica cliente2 = new PessoaJuridica ("\nRenata", "Brasileira", 30, "Básica", "solteira", "sociedade", 20);
		
		PessoaFisica cliente3 = new PessoaFisica ("\nCintia", "Angolana", 22, "Senior", "casada", "083.922.179-4", "Empregada");
		PessoaFisica cliente4 = new PessoaFisica ("\nMaria", "Italiana", 68, "Básica", "viúva", "542.685.999-3", "Aposentada");
		
		 cliente1.vizualiza();
		 cliente2.vizualiza();
		 cliente3.vizualiza();
		 cliente4.vizualiza();
	}

}

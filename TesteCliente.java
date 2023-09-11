package AulaGeneration;

public class TesteCliente {

	public static void main(String[] args) {
		ClasseCliente cliente1 = new ClasseCliente ("Mike", "Brasileiro", 32, "Premium", "Casado\n");
		ClasseCliente cliente2 = new ClasseCliente ("Renata", "Brasileira", 30, "Básica", "solteira\n");
		
		 cliente1.vizualiza();
		 cliente2.vizualiza();
	}

}

package AulaGeneration;

public class TesteFarmacia {

	public static void main(String[] args) {
		Farmacia farm1 = new Farmacia ("Drogabit", "R. João Pedro, 56 - Bairro  vila das Américas", "08h - 20h", "sim", "sim\n"); 
		Farmacia farm2 = new Farmacia ("Farmatudo", "Av. Coração de leão, 1915 - Bairro Pitangas", "24h", "sim", "não");
		
		farm1.vizualiza();
		farm2.vizualiza();

	}

}

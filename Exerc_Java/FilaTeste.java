package AulaGeneration;

public class FilaTeste {

	public static void main(String[] args) {
		FilaExemplo fila = new FilaExemplo(3);
		fila.enqueue(10);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(20);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(30);
		System.out.println("Item adicionado na fila: " + fila.pegarFim());
		
		fila.enqueue(40);
		
		fila.dequeue();
	}

}

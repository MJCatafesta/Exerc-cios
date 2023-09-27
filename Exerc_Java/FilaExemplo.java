package AulaGeneration;

public class FilaExemplo {
	private int fila[];
	private int tamanhoMaximo;
	private int inicio;
	private int fim;
	private int total;
	
	public FilaExemplo (int s) {
		tamanhoMaximo = s;
		fila = new int [s];
		inicio = 0;
		fim = -1;
		total = 0;
		}
	
	public int pegarInicio () {
		return fila[inicio];
	}
	
	public int pegarFim () {
		return fila[fim];
	}
	
	public boolean checarMax() {
		return total == tamanhoMaximo;
	}
	
	public boolean checarVazio() {
		return total == 0;
	}
	
	public void enqueue (int item) {
		if (checarMax ()) {
			System.out.println(" Não é possível adicionar pois a fila está cheia.");
	}
	
	else {
		fim ++;
		fila[fim] = item;
		total++;
	}
	}
	
	public void dequeue() {
		if(checarVazio()) {
			System.out.println("A fila está vazia, não há o que remover.");
		}
		else {
			System.out.println("Item removido da fila " + fila[inicio]);
			inicio++;
			total--;
			
		}
	}
}

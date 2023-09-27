package AulaGeneration;

public class Teste_Pilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(3);
		
pilha.push(10);
System.out.println("Objeto adicionado à pilha: " + pilha.peek());

pilha.push(20);
System.out.println("Objeto adicionado à pilha: " + pilha.peek());

pilha.push(30);
System.out.println("Objeto adicionado à pilha: " + pilha.peek());

pilha.push(40);

pilha.pop();
	}

}

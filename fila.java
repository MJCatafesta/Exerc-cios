package AulaGeneration;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
    Queue<String>fila = new LinkedList();
    boolean processar = true;
    
    
    while(processar != false) {
    System.out.println("\n3===============MENU==================");
    System.out.println("1: Adicionar um novo cliente na fila.");
    System.out.println("2: Listar todos os cliente na fila.");
    System.out.println("3: Chamar (retirar) um cliente da fila.");
    System.out.println("0: O programa deve ser finalizado.");
    
    System.out.println ("Digite a opção desejada: ");
    int opcao = leia.nextInt();
    
    
    
    switch (opcao) {
    
    

    case 1:
    	
    System.out.println("Digite o nome do novo cliente: ");
    leia.skip("\\R");
    String nome = leia.next();
    fila.add(nome);

    System.out.println("O(a) cliente " + nome + " foi adicionado(a)!");
    
    break;

    case 2:
    if(fila.isEmpty()){
    System.out.println("Lista de clientes está vazia.");
    
    }
    
    else { 
    	System.out.println("Lista de clientes: ");
    	for(String i : fila) {
    		System.out.println(i);
    		 
    	}
    		
    }

    break;

    case 3:
    	if (fila.isEmpty()) {
    		System.out.println("Não há ninguém na fila.");
    	} else {
    		
    fila.remove();
    System.out.println("O(a) cliente foi chamado(a).");
    	}

    break;
    
    	case 0:
    		
    	    System.out.println("Programa Finalizado.");
    	    processar = false;
    	    break;

    default:
    	System.out.println("Opção inválida.");
    
    }
    }
	}
}
    

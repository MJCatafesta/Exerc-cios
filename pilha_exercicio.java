package AulaGeneration;
import java.util.Stack;
import java.util.Scanner;


public class pilha_exercicio {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	boolean processador = true;
    Stack<String>pilha = new Stack<String>();{    
    
    while(processador != false) {
    System.out.println("\n===============MENU==================");
    System.out.println("1: Adicionar um novo livro na pilha.");
    System.out.println("2: Listar todos os livros da pilha.");
    System.out.println("3: Retirar um livro da pilha.");
    System.out.println("0: O programa deve ser finalizado.");
    
    System.out.println ("Digite a opção desejada: ");
    int opcao = leia.nextInt();
    
    
    
    switch (opcao) {
    
    

    case 1:
    	
    System.out.println("Digite o nome do livro que irá adicionar: ");
    leia.skip("\\R");
    String livro = leia.nextLine();
    pilha.add(livro);

    System.out.println("O livro: " + livro + " foi adicionado à pilha!");
    
    break;

    case 2:
    if(pilha.isEmpty()){
    System.out.println("A pilha de livros está vazia.");
    
    }
    
    else { 
    	System.out.println("Pilha de livros: ");
    	for(String i : pilha) {
    		System.out.println(i);
    		 
    	}
    		
    }

    break;

    case 3:
    	if (pilha.isEmpty()) {
    		System.out.println("Não há livros na pilha.");
    	} else {
    		
    pilha.pop();
    System.out.println("O livro foi removido.");
    	}

    break;
    
    	case 0:
    		
    	    System.out.println("Programa Finalizado.");
    	    processador = false;
    	    break;

    default:
    	System.out.println("Opção inválida.");
    
    }
    }
	}

	}
}



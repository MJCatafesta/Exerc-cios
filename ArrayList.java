package AulaGeneration;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ArrayList {
	 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String cor = ("");
		int i =0;
		java.util.ArrayList<String>coresEscolhidas = new java.util.ArrayList<>();
		
		for(i=0; i<=4; i++) {
		
		System.out.println("Escreva a cor que você deseja armazenar na lista: ");
		cor = ler.next();
		coresEscolhidas.add(cor);
		
		
		}
		System.out.print("\nLista de cores: \n");
		
		for (String e : coresEscolhidas) {
	    		System.out.println("\n" + e);
	    		 
		}
		Collections.sort(coresEscolhidas);
		System.out.println("\nLista de cores em ordem alfabética: \n" + coresEscolhidas);
	}

	private void add(String cor) {
		// TODO Auto-generated method stub
		
	}
	
		
	}


package AulaGeneration;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeroEscolhido;
		int contador=0;
		int numeros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
	
		System.out.println("Digite um número para saber sua posição no vetor:");
		numeroEscolhido = ler.nextInt();
		
		
			while(numeroEscolhido != numeros[contador]){ 
				contador = contador + 1;
				
			if(contador == 10){ 
				System.out.println("O número " + numeroEscolhido + "não foi encontrado.");
				break;}
			
			if(numeroEscolhido == numeros[contador]) {
			System.out.println("O número " + numeroEscolhido + " está na posição: " + contador);
			break;
		}
}
}
}


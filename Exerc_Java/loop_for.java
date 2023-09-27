package AulaGeneration;

import java.util.Scanner;

public class loop_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		 int contador;
		
		System.out.println("Digite um número:");
		int n1 = ler.nextInt();
		
		System.out.println("Digite um número:");
		int n2 = ler.nextInt();
		
		if(n1 >= n2) {
			System.out.println("Intervalo inválido.");
		}
		else {
				contador = n1;
			for(contador = n1; contador <= n2; contador ++) 
			{ if(contador % 3 == 0 && contador % 5 == 0) { 
				System.out.println(contador + " é multiplo de 3 e de 5.");
		} 
			}
	}
		}
}

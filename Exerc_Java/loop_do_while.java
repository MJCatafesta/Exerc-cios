package AulaGeneration;

import java.util.Scanner;

public class loop_do_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int totalPovitivos=0, n;
		
		do {
			System.out.println("Escreva um número inteiro: ");
			n = ler.nextInt();
			if(n > 0){
			totalPovitivos = totalPovitivos + n;	
			}
		}
		while(n!=0);
		System.out.println("A soma dos números positivos é: " + totalPovitivos);
	}
	
}

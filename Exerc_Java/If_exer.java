package AulaGeneration;

import java.util.Scanner;

public class If_exer {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
        int a = ler.nextInt();
		
        System.out.println("Digite o valor de b: ");
        int b = ler.nextInt();
		
        System.out.println("Digite o valor de c: ");
        int c = ler.nextInt();
        
        
		if(a + b > c) {
		System.out.println("a soma de " + a + " + " + b + " é maior que " + c );
		}
		
		
		if(a + b < c) {
		System.out.println("a soma de " + a + " + " + b + " é menor que " + c );
		}
		
		
	    if(a + b == c) {
	    	System.out.println("a soma de " + a + " + " + b + " é igual a " + c );
		}
	}

}

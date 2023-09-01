package AulaGeneration;

import java.util.Scanner;

public class switch_exer {

	public static void main(String[] args) {
		int opcao;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número: ");
		Float n1 = ler.nextFloat();
		
		System.out.println("Digite um segundo número: ");
		Float n2 = ler.nextFloat();
		
		System.out.println("\nEscolha a operação que deseja realizar: ");
		System.out.println("--Digite 1 para realizar soma.--");
		System.out.println("--Digite 2 para realizar subtração.--");
		System.out.println("--Digite 3 para realizar multiplicação.--");
		System.out.println("--Digite 4 para realizar divisão.--");
		
		opcao = ler.nextInt();
		
		if(opcao == 1) {
		System.out.println(n1 + " + " + n2 + "= " + (n1 + n2));
		}
		
		else if(opcao == 2) {
			System.out.println(n1 + " - " + n2 + "= " + (n1 - n2));
		}
		
		else if(opcao == 3) {
			System.out.println(n1 + " x " + n2 + "= " + (n1 * n2));
		}
		
		else if(opcao == 4) {
			System.out.println(n1 + " ÷ " + n2 + "= " + (n1 / n2));
		}
		else{
			System.out.println("Escolha um número válido.");
		}
	}
}






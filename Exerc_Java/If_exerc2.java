package AulaGeneration;

import java.util.Scanner;

public class If_exerc2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = ler.nextLine();

		System.out.println("Digite sua idade: ");
		int idade = ler.nextInt();
		
		if (idade >= 18 && idade <= 59) {
			System.out.println(
					"Caro(a) " + nome + ", você pode doar sangue.");
		}

		if(idade < 18 || idade > 69){
			System.out.println(nome + "não está apto(a) para doar sangue, apenas pessoas entre 18 e 69 anos são permitidas.");
		}
		
		if (idade >= 60 && idade <= 69) {
			System.out.println("É a sua primeira doação?\n " + "1- sim\n" + "2- não");
			int primeira = ler.nextInt();

			if (primeira == 1) {
				System.out.println(nome + " não está apto(a) para doar sangue!");
			}

			else if (primeira == 2) {
				System.out.println(nome + " está apto(a) para doar sangue!");

			}
		
		 
		}
		}
	}



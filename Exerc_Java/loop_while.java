package AulaGeneration;

import java.util.Scanner;

public class loop_while {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0, maior50 =0, menor21 =0;
		
		
		while(idade >= 0) {
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade < 21 && idade>=0){
			menor21 = menor21 + 1;}
		
		if(idade > 50){
		maior50 =  maior50 + 1;}
		}
		if(idade < 0){
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
		}
	}

}

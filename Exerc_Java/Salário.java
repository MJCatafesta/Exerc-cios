package AulaGeneration;

import java.util.Scanner;

public class Salário {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
        Float salario = ler.nextFloat();
        
        System.out.println("Digite seu abono: ");
        Float abono = ler.nextFloat();
        
        Float novoSalario = salario + abono;
        System.out.println("Seu novo salário é: " + novoSalario);
        
	}

}

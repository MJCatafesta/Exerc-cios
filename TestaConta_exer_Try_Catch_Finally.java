package contabancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		boolean loop = true;
		
		ContaBancaria novaConta = new ContaBancaria();
		do {
		try {
		System.out.println("Digite o número da conta: ");
		novaConta.setNumero(leia.nextInt());
		
		System.out.println("Digite o número da agência: ");
		novaConta.setAgencia(leia.nextInt());
		
		System.out.println("Digite o tipo da conta: ");
		novaConta.setTipo(leia.nextInt());
		
		
		System.out.println("Digite o nome do Titular da conta: ");
		leia.skip("\\R");
		novaConta.setTitular(leia.nextLine());
		
		loop = false;
		
		}catch(InputMismatchException e){
			leia.nextLine();
			System.out.println("\nCaracteres não aceitos");
			
		}catch(ArithmeticException e){
			leia.nextLine();
			System.out.println("Apenas números positivos e inteiros são aceitos nas seções Número da conta, Agência e Tipo de conta.");
		}
		
	    }while (loop);		
		novaConta.setSaldo(4000.0f);
		
		System.out.println("\nDados da conta: ");
		System.out.println("\n");
		System.out.println("Titular: " + novaConta.getTitular());
		System.out.println("Numero da conta: " + novaConta.getNumero());
		System.out.println("Numero da agencia: " + novaConta.getAgencia());
		System.out.println("Tipo da conta: " + novaConta.getTipo());
		System.out.println("Saldo: " + novaConta.getSaldo());
		
		loop = false;
	}

}

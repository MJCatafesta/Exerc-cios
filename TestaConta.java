package contabancaria;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class TestaConta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		boolean loop = true;
		int[] dadosNumericos = new int[3];
		Float dadosFloat;
		String dadosPalavras;
		int i=0;
		
		ContaBancaria novaConta = new ContaBancaria();
		
		
	
			

		System.out.println("Digite o número da conta: ");
		novaConta.setNumero(leia.nextInt());
		dadosNumericos[i] = novaConta.getNumero();
		i++;
		
		System.out.println("Digite o número da agência: ");
		novaConta.setAgencia(leia.nextInt());
		dadosNumericos[i] = novaConta.getAgencia();
		i++;
		
		System.out.println("Digite o tipo da conta: ");
		novaConta.setTipo(leia.nextInt());
		dadosNumericos[i] = novaConta.getTipo();
		i++;
		
			
			for(int e= 0; e<= 2; e++){
				Optional<Integer> checarNuloInt = Optional.ofNullable(dadosNumericos[e]);
				if (checarNuloInt.isPresent()) {
					System.out.println(dadosNumericos[e]);
					System.out.println("Dado presente.");
				}
				else {
					System.out.println("dado nulo");
				}
			}
			
		
		
		System.out.println("Digite o nome do Titular da conta: ");
		leia.skip("\\R");
		novaConta.setTitular(leia.nextLine());
		
			
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

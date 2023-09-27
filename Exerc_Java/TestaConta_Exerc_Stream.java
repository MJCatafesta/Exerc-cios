package contabancaria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestaConta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] dadosNumericos = new int[3];
		int[] dadosNumericos2 = new int[3];
		int[] dadosNumericos3 = new int[3];
		Float dadosFloat;
		String dadosPalavras;
		int i=0;
		int u=0;
		int r=0;
		ArrayList<String> titulares = new java.util.ArrayList<>();
		
		
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
					System.out.println("Esse são os dados presentes: " + dadosNumericos[e]);
					
				}
				else {
					System.out.println("dado nulo");
				}
			}
			
		
		
		System.out.println("Digite o nome do Titular da conta: ");
		leia.skip("\\R");
		novaConta.setTitular(leia.nextLine());
		titulares.add(novaConta.getTitular());

			
		novaConta.setSaldo(4000.0f);
		
		System.out.println("\nDados da conta: ");
		System.out.println("\n");
		System.out.println("Titular: " + novaConta.getTitular());
		System.out.println("Numero da conta: " + novaConta.getNumero());
		System.out.println("Numero da agencia: " + novaConta.getAgencia());
		System.out.println("Tipo da conta: " + novaConta.getTipo());
		System.out.println("Saldo: " + novaConta.getSaldo());
		
		
		
ContaBancaria novaConta2 = new ContaBancaria();
		
		

		System.out.println("Digite o número da conta: ");
		novaConta2.setNumero(leia.nextInt());
		dadosNumericos2[u] = novaConta2.getNumero();
		u++;
		
		System.out.println("Digite o número da agência: ");
		novaConta2.setAgencia(leia.nextInt());
		dadosNumericos2[u] = novaConta2.getAgencia();
		u++;
		
		System.out.println("Digite o tipo da conta: ");
		novaConta2.setTipo(leia.nextInt());
		dadosNumericos2[u] = novaConta2.getTipo();
		u++;
		
			
			for(int t= 0; t<= 2; t++){
				Optional<Integer> checarNuloInt = Optional.ofNullable(dadosNumericos2[t]);
				if (checarNuloInt.isPresent()) {
					System.out.println("Esse são os dados presentes: " + dadosNumericos2[t]);
					
				}
				else {
					System.out.println("dado nulo");
				}
			}
			
		
		
		System.out.println("Digite o nome do Titular da conta: ");
		leia.skip("\\R");
		novaConta2.setTitular(leia.nextLine());
		titulares.add(novaConta2.getTitular());

			
		novaConta2.setSaldo(2000.0f);
		
		System.out.println("\nDados da conta: ");
		System.out.println("\n");
		System.out.println("Titular: " + novaConta2.getTitular());
		System.out.println("Numero da conta: " + novaConta2.getNumero());
		System.out.println("Numero da agencia: " + novaConta2.getAgencia());
		System.out.println("Tipo da conta: " + novaConta2.getTipo());
		System.out.println("Saldo: " + novaConta2.getSaldo());
		
		
		
		
ContaBancaria novaConta3 = new ContaBancaria();
		
		

		System.out.println("\nDigite o número da conta: ");
		novaConta3.setNumero(leia.nextInt());
		dadosNumericos3[r] = novaConta3.getNumero();
		r++;
		
		System.out.println("Digite o número da agência: ");
		novaConta3.setAgencia(leia.nextInt());
		dadosNumericos3[r] = novaConta3.getAgencia();
		r++;
		
		System.out.println("Digite o tipo da conta: ");
		novaConta3.setTipo(leia.nextInt());
		dadosNumericos3[r] = novaConta3.getTipo();
		r++;
		
			
			for(int d= 0; d<= 2; d++){
				Optional<Integer> checarNuloInt = Optional.ofNullable(dadosNumericos3[d]);
				if (checarNuloInt.isPresent()) {
					System.out.println("Esse são os dados presentes: " + dadosNumericos3[d]);
					
				}
				else {
					System.out.println("dado nulo");
				}
			}
			
		
		
		System.out.println("Digite o nome do Titular da conta: ");
		leia.skip("\\R");
		novaConta3.setTitular(leia.nextLine());
		titulares.add(novaConta3.getTitular());

			
		novaConta3.setSaldo(7500.0f);
		
		System.out.println("\nDados da conta: ");
		System.out.println("\n");
		System.out.println("Titular: " + novaConta3.getTitular());
		System.out.println("Numero da conta: " + novaConta3.getNumero());
		System.out.println("Numero da agencia: " + novaConta3.getAgencia());
		System.out.println("Tipo da conta: " + novaConta3.getTipo());
		System.out.println("Saldo: " + novaConta3.getSaldo());
		
		
		
		List<String> nomeTitulares = titulares.stream()
				 .sorted()
				 .collect(Collectors.toList());
		
		System.out.println("Esses são os nomes dos titulares das contas em ordem alfabética: " + nomeTitulares);
	}

	}



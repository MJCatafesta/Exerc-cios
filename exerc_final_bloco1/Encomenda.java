package exerc_final_bloco1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import AulaGeneration.ClasseCliente;

public class Encomenda {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		boolean loop = true;
		boolean processador = true;
		boolean processador2 = true;
		int confirma = 0;
		ArrayList<Cliente>cadastro = new ArrayList<>();
		ArrayList<Calçado>carrinho = new ArrayList<>();
		
		
		while(processador != false) {
		    System.out.println("===============MENU==================");
		    System.out.println("1: Faça seu cadastro.");
		    System.out.println("2: Peça uma encomenda.");
		    System.out.println("0: Sair.");
		    
		    System.out.println ("Digite a opção desejada: ");
		    int opcao = leia.nextInt();
		    leia.nextLine();
		    
		    switch (opcao) {
		    
		    case 1:
		    	
		System.out.println("====== Faça seu cadastro ======");
	
		do {
			
		try {
		  Cliente pessoa = new Cliente();

		   
		
		System.out.println("Nome: ");
		pessoa.setNome(leia.nextLine());
		cadastro.add(pessoa);
		
		
		System.out.println("Idade: ");
		pessoa.setIdade(leia.nextLine());
		cadastro.add(pessoa);
		
		
		System.out.println("CPF: ");
		pessoa.setCpf(leia.nextLine());
		cadastro.add(pessoa);
		
		System.out.println("Digite 1 para finalizar cadastro e 0 se deseja cancelar cadastro: ");
	    confirma = leia.nextInt();
		
		loop = false;
		
	}catch(InputMismatchException e) {
		leia.nextLine();
		System.out.println("\nDado inválido, por favor, tente novamente.");
		
	}catch(ArithmeticException e){
		
		leia.nextLine();
		System.out.println("\nDigite Numeros inteiros positivos!");
		
	}finally{
        System.out.println("\n==============================\n");
    }
		
		}
       while (loop);
		break;
		
		    case 2: if(confirma == 1) {
		    	
		    	 while(processador2 != false) {
		    		    System.out.println("\n===============MENU de encomenda==================");
		    		    System.out.println("1- Bota");
		    		    System.out.println("2- Sapato social.");
		    		    System.out.println("3- Mocassim.");
		    		    System.out.println("0- Sair.");
		    		    System.out.println("\n");
		    		    System.out.println("Digite o número do tipo de calçado que deseja encomendar:");
		    		    
		    		    int segundaOpcao = leia.nextInt();
		    	        leia.nextLine();
		    		    
		    	switch (segundaOpcao) {
		    	
		    	case 1: 
		    		Bota bota = new Bota (null, null, null, null, null, 0, null, 0, null);
		    		
		    		System.out.println("Você deseja uma bota feminina ou masculina?");
		    		bota.setM_F(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado na parte externa da sua bota: Couro, Camurça ou Couro Sintético?");
		    		bota.setExterior(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado na sola da sua bota: Couro, Borracha ou Rocha Vulcanizada?");
		    		bota.setSolado(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado no interior da sua bota: lã, pele ou sintético?");
		    		bota.setInterior(leia.nextLine());
		    		
		    		System.out.println("Deseja palmilha de Gel, Espuma ou Silicone?");
		    		bota.setPalmilha(leia.nextLine());
		    		
		    		System.out.println("Digite o tamanho que deseja: ");
		    		bota.setTamanho(leia.nextInt());
		    		leia.nextLine();
		    		
		    		System.out.println("Digite a cor desejada: ");
		    		bota.setCor(leia.nextLine());
		    		
		    		System.out.println("Digite o tamanho do cano da bota: ");
		    		bota.setTamanhoCano(leia.nextInt());
		    		leia.nextLine();
		    		
		    		System.out.println("Deseja uma bota com ou sem cadarço?");
		    		bota.setCadarço(leia.nextLine());
		    		
		    		
		    		System.out.println("\nVerifique as opções escolhidas: \\n");
		    		System.out.println("Masc ou Fem: " + bota.getM_F());
		    		System.out.println("Material parte externa: " + bota.getExterior());
		    		System.out.println("Material sola: " + bota.getSolado());
		    		System.out.println("Material interior: " + bota.getInterior());
		    		System.out.println("Palmilha: " + bota.getPalmilha());
		    		System.out.println("Tamanho: " + bota.getTamanho());
		    		System.out.println("Cor: " + bota.getCor());
		    		System.out.println("Tamanho do cano: " + bota.getTamanhoCano());
		    		System.out.println("Cadarço: " + bota.getCadarço());
		    		System.out.println("\nDigite 1 para confirmar encomenda ou qualquer outro número para cancelar: ");
		    		int confirmaCancelaBota = leia.nextInt();
		    		leia.nextLine();
		    		
		    		if (confirmaCancelaBota == 1) 
		    		{
		    		carrinho.add(bota);
		    		} 
		    		else
		    			System.out.println("Pedido cancelado.");
		    		 
		    		break;
		    		
		    		
		    		
		    		
		    		
		    	case 2:
		    		SapatoSocial sapato = new SapatoSocial(null, null, null, null, null, 0, null, null, null, null);
		    		
		    		System.out.println("Você deseja um sapato feminino ou masculino?");
		    		sapato.setM_F(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado na parte externa do seu sapato: Couro, Camurça ou Couro Sintético?");
		    		sapato.setExterior(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado na sola do seu sapato: Couro, Borracha ou Rocha Vulcanizada?");
		    		sapato.setSolado(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado no interior do seu sapato: lã, pele ou sintético?");
		    		sapato.setInterior(leia.nextLine());
		    		
		    		System.out.println("Deseja palmilha de Gel, Espuma ou Silicone?");
		    		sapato.setPalmilha(leia.nextLine());
		    		
		    		System.out.println("Digite o tamanho que deseja: ");
		    		sapato.setTamanho(leia.nextInt());
		    		leia.nextLine();
		    		
		    		System.out.println("Digite a cor desejada: ");
		    		sapato.setCor(leia.nextLine());
		    		
		    		System.out.println("Deseja que seu sapato tenha brogues?");
		    		sapato.setBrogue(leia.nextLine());
		    		
		    		System.out.println("Deseja um sapato com ou sem cadarço?");
		    		sapato.setCadarço(leia.nextLine());
		    		
		    		System.out.println("Qual formato de bico deseja: quadrado, pontudo ou redondo?");
		    		sapato.setBico(leia.nextLine());
		    		
		    		System.out.println("\nVerifique as opções escolhidas: \\n");
		    		System.out.println("Masc ou Fem: " + sapato.getM_F());
		    		System.out.println("Material parte externa: " + sapato.getExterior());
		    		System.out.println("Material sola: " + sapato.getSolado());
		    		System.out.println("Material interior: " + sapato.getInterior());
		    		System.out.println("Palmilha: " + sapato.getPalmilha());
		    		System.out.println("Tamanho: " + sapato.getTamanho());
		    		System.out.println("Cor: " + sapato.getCor());
		    		System.out.println("Com ou sem brogue: " + sapato.getBrogue());
		    		System.out.println("Cadarço: " + sapato.getCadarço());
		    		System.out.println("Formato do bico: " + sapato.getBico());
		    		
		    		System.out.println("\nDigite 1 para confirmar encomenda ou qualquer outro número para cancelar: ");
		    		int confirmaCancelaSapato = leia.nextInt();
		    		leia.nextLine();
		    		
		    		if (confirmaCancelaSapato == 1) 
		    		{
		    		carrinho.add(sapato);
		    		} 
		    		else
		    			System.out.println("Pedido cancelado.");
		    		
		    	
		    		break;
		    		
		    		
		    		
		    		
		    		
		    		
		    	case 3:
                    Mocassim mocassim = new Mocassim (null, null, null, null, null, 0, null, null, null);
		    		
		    		System.out.println("Você deseja um mocassim feminino ou masculino?");
		    		mocassim.setM_F(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado na parte externa do seu mocassim: Couro, Camurça ou Couro Sintético?");
		    		mocassim.setExterior(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado na sola do seu mocassim: Couro, Borracha ou Rocha Vulcanizada?");
		    		mocassim.setSolado(leia.nextLine());
		    		
		    		System.out.println("Qual material será usado no interior do seu mocassim: lã, pele ou sintético?");
		    		mocassim.setInterior(leia.nextLine());
		    		
		    		System.out.println("Deseja palmilha de Gel, Espuma ou Silicone?");
		    		mocassim.setPalmilha(leia.nextLine());
		    		
		    		System.out.println("Digite o tamanho que deseja: ");
		    		mocassim.setTamanho(leia.nextInt());
		    		leia.nextLine();
		    		
		    		System.out.println("Digite a cor desejada: ");
		    		mocassim.setCor(leia.nextLine());
		    		
		    		System.out.println("Deseja que seu mocassim tenha salto?");
		    		mocassim.setSalto(leia.nextLine());
		    		
		    		System.out.println("Deseja um mocassim com ou sem cadarço?");
		    		mocassim.setCadarço(leia.nextLine());
		    		
		    		
		    		System.out.println("\nVerifique as opções escolhidas: \\n");
		    		System.out.println("Masc ou Fem: " + mocassim.getM_F());
		    		System.out.println("Material parte externa: " + mocassim.getExterior());
		    		System.out.println("Material sola: " + mocassim.getSolado());
		    		System.out.println("Material interior: " + mocassim.getInterior());
		    		System.out.println("Palmilha: " + mocassim.getPalmilha());
		    		System.out.println("Tamanho: " + mocassim.getTamanho());
		    		System.out.println("Cor: " + mocassim.getCor());
		    		System.out.println("Com ou sem salto: " + mocassim.getSalto());
		    		System.out.println("Cadarço: " + mocassim.getCadarço());
		    		
		    		System.out.println("\nDigite 1 para confirmar encomenda ou qualquer outro número para cancelar: ");
		    		int confirmaCancelaMocassim = leia.nextInt();
		    		leia.nextLine();
		    		
		    		if (confirmaCancelaMocassim == 1) 
		    		{
		    		carrinho.add(mocassim);
		    		} 
		    		else
		    			System.out.println("Pedido cancelado.");
		    		
		    		break;
		    		
		    		
		    		
		    		
		    		
		    	case 0:
		    		
		    	    System.out.println("Retornando para o menu principal.");
		    	    processador2 = false;
		    	    break;

		    default:
		    	System.out.println("Opção inválida.");
		    
		    	}
		    	
		    	 }
		    }
		    	 else {
			    		System.out.println("você não fez seu cadastro, digite 1 para se registrar: ");
			  
			    	}
                break;
		    	
		    case 0:
	    		
	    	    System.out.println("Programa Finalizado.\n Sua lista de pedidos contém: " + carrinho.size());
	    	    
	        	
	        	
	    	    processador = false;
	    	    break;

	    default:
	    	System.out.println("Opção inválida.");
	    
	    }
		
		}
		}
}



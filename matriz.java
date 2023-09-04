package AulaGeneration;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float somaDasNotas = 0;
		int coluna = 0, coluna2 = 0, linha = 0;
		float notas[][] = new float[10][4];
		float tabelaMedias[] = new float[10];
		
		
		for (linha = 0; linha <= 9; linha++) {
			for (coluna = 0; coluna <= 3; coluna++) {
				System.out.println("Digite sua nota: ");
				notas[linha][coluna] = ler.nextFloat();
			}
		}/*li todas as notas e coloquei na matriz. */
		
		
		for (linha = 0; linha <= 9; linha++) {
			
		for (coluna = 0; coluna <= 3; coluna++) {
			somaDasNotas = somaDasNotas + notas[linha][coluna];
			if(coluna == 3) {
		    tabelaMedias[coluna2] = somaDasNotas/4;
		    coluna2 = coluna2 + 1;
		    somaDasNotas=0;
		    System.out.printf(" | " + tabelaMedias[linha]);
			}			
			}
		}
	}
}
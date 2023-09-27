package AulaGeneration;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collection_set {

	public static Scanner ler = new Scanner(System.in);

	public static HashSet<Integer> set = new HashSet<>();

	public static void main(String[] args) {

		construir();
		exibir();

	}

	public static void construir() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("(%d de 10) digite um número inteiro: ", i + 1);
			var numeropa = ler.nextInt();
			if(!verificar(numeropa)) {
			set.add(numeropa);
			}
			else { 
				System.out.println("Número repetido." + numeropa);
			}
			}

			}

	
 public static void exibir() {
	 System.out.println("Listar dado do set: ");
	 var meuiterator = set.iterator();
	 while(meuiterator.hasNext())
	 {
		 System.out.println(meuiterator.next());
	 }
	 //retorna verdadeiro ou falso
 }
 public static boolean verificar(int n1) {
	return set.contains(n1);
 }
}

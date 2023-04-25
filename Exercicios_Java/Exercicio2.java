package Exercicios_Java;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		String nome;
		Scanner ler = new Scanner(System.in);
		do {
			System.out.print("Digite um Nome ou . para sair: ");
			nome = ler.nextLine();
			if (nome.charAt(0) != '.') {
				System.out.print(nome.toUpperCase().charAt(0)+".");
				for (int i=1; i < nome.length(); i++)
					if (nome.charAt(i) == ' ')
					   System.out.print(nome.toUpperCase().charAt(i+1)+".");
				System.out.println();
			}
			
		} while (nome.charAt(0)!='.');
		
		System.out.println("\nFim!!!");

	}
	

}

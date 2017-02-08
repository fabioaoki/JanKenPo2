package Projeto2;

import java.util.Random;
import java.util.Scanner;

public class Projeto2 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		Random rand = new Random();
		
		int jogador = 0, tentativas = 0;
		int cpu = rand.nextInt(3);		
		
		while (jogador != cpu) {
			System.out.println("Escolha! PAPEL-0 PEDRA-1 TESOURA-2: ");
			jogador = ent.nextInt();
			
			if (jogador < cpu ) {
				System.out.println("Você perdeu! ");
			}
			else if (jogador > cpu) {
				System.out.println("Empate! Tente novamente: ");
			}
			else {
				System.out.println("Parabéns! Você ganhou! ");
			}
			
			tentativas ++;
			
		}
		
		System.out.println("Numero de tentativas: " + tentativas );
	}

}

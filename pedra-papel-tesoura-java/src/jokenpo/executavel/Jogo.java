package jokenpo.executavel;

import java.util.Scanner;

class Jogo {
	public static void main(String args[]) {
		int jogador, computador;
		Scanner caractere = new Scanner(System.in);

		System.out.println("----- Pedra, papel e tesoura -----");
		System.out.println("");
		System.out.println(" 1 - Para esoclher pedra ");
		System.out.println(" 2 - Para escolher papel ");
		System.out.println(" 3 - Para escolher tesoura");
		System.out.println("");
		System.out.println("Digite um desses números para escolher : ");

		jogador = caractere.nextInt();

		switch (jogador) {
		case 1:
			System.out.println("O jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("O jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("O jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção Invalida");

		}

		computador = (int) (Math.random() * 3 + 1);

		caractere.close();

		switch (computador) {
		case 1:
			System.out.println("O computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("O computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("O computador escolheu TESOURA");
			break;
		}

		System.out.println("");
		if (jogador == computador) {
			System.out.println("O JOGO EMPATOU");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("O jogador VENCE!!");
			} else {
				System.out.println("infelizmente mas o computador VENCE!!");
			}
		}

	}
}
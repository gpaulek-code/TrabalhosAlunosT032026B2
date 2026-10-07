package dupla;

import java.util.Scanner;

public class Trabaio {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int senhaReal = 123;
		login(senhaReal);
	}

	public static void login(int senhaReal) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Digite sua senha: ");
			int senha = scanner.nextInt();

			if (senha == senhaReal) {
				menu();
			} else if (senha != senhaReal) {
				System.out.println("Erro! Tente novamente");

			}
		}
		System.out.println("Limite Excedido");
	}

	public static void menu() {

		double saldo = 0;

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Sair");

			int opcao = scanner.nextInt();

			if (opcao == 1) {
				saldo = consultar(saldo);
			} else if (opcao == 2) {
				saldo = depositar(saldo);
			} else if (opcao == 3) {
				saldo = sacar(saldo);
			} else if (opcao == 4) {
				System.out.println("Encerrando sistema...");
				break;
			} else {
				System.out.println("Opção inválida! Tente novamente.");
			}
		}
	}

	public static double consultar(double saldo) {
		System.out.printf("Seu saldo atual é: %.2f%n", saldo);
		return saldo;
	}

	public static double depositar(double saldo) {
		double valorDeposito = 0;
		System.out.println("Digite o valor que deseja depositar: ");
		valorDeposito = scanner.nextDouble();

		if (valorDeposito < 0) {
			System.out.println("Valor inválido! Digite um valor positivo.");
		}

		saldo += valorDeposito;

		return saldo;

	}

	public static double sacar(double saldo) {
		double valorSaque = 0;
		System.out.println("Digite o valor que deseja sacar: ");
		valorSaque = scanner.nextDouble();

		if (valorSaque > saldo) {
			System.out.println("Saldo insuficiente ");
		} else if (valorSaque < 0) {
			System.out.println("Valor inválido! Digite um valor positivo.");
		}
		saldo -= valorSaque;

		return saldo;

	}
}
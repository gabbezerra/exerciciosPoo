package exerciciosPoo;

import java.util.Scanner;

public class redesComp {
	static Scanner sc = new Scanner(System.in);
	static String[] ip = new String[100];
	static String[] nomePc = new String[100];
	static String[] marcaPc = new String[100];
	static int posicao = 0;

	public static void main(String[] args) {
		int continuar = 1;

		while (continuar == 1) {

			ip[posicao] = leString(sc, "Entre com o IP do computador: ");
			nomePc[posicao] = leString(sc, "Digite o NOME do computador: ");
			marcaPc[posicao] = leString(sc, "Digite a MARCA do computador: ");
			continuar = leInt(sc, "Deseja cadastrar outro?\n1. SIM\n2. NÃO\n");
			posicao++;
		}

		int opcao = leInt(sc, montarMenu());
		while (opcao != 4) {
			switch (opcao) {
			case 1:
				imprimirDados();
				break;
			case 2:
				imprimirApple();
				break;
			case 3:
				imprimirClasseD();
				break;
			case 4:
				System.exit(0);
				break;

			}
			opcao = leInt(sc, montarMenu());
		}
	}

	public static String montarMenu() {
		return ("1 - Imprimir na tela os dados armazenados\n" + "2 - Imprimir na tela os computadores da marca Apple\n"
				+ "3 - Imprimir na tela os computadores cujos IPs estejam na classe D\n" + "4 - Sair\n");

	}

	// 224.0.0.0 até 239.255.255.255
	private static void imprimirClasseD() {
		for (int i = 0; i < posicao; i++) {
			if (compararStringMaiorQue(ip[i], "224.0.0.0") && compararStringMenorQue(ip[i], "239.255.255.255")) {
				mostrarDados(i);
			}

		}

	}

	private static void imprimirApple() {
		for (int i = 0; i < posicao; i++) {
			if (marcaPc[i].equalsIgnoreCase("aPplE")) {
				mostrarDados(i);
			}

		}

	}

	private static void imprimirDados() {
		for (int i = 0; i < posicao; i++) {

			mostrarDados(i);
		}

	}

	public static String leString(Scanner in, String msg) {

		System.out.print(msg);
		while (!in.hasNextLine()) {
			in.nextLine();
			System.out.print("Tipo de dado inválido. Digite um texto valido: ");
		}
		String r = in.nextLine();
		// in.nextLine();

		return r;
	}

	public static int leInt(Scanner in, String msg) {

		System.out.print(msg);
		while (!in.hasNextInt()) {
			in.nextLine();
			System.out.print("Tipo de dado inválido. Digite uma opção valida: ");
		}
		int r = in.nextInt();
		in.nextLine();

		return r;
	}

	private static void mostrarDados(int i) {
		System.out.print("IP: " + ip[i] + ", ");
		System.out.print("Nome do PC: " + nomePc[i] + ", ");
		System.out.print("Marca do PC: " + marcaPc[i] + "\n");
	}

	private static boolean compararStringMaiorQue(String s, String s2) {
		int x = s.compareTo(s2);
		if (x == 0) {
			return true;
		} else if (x == 1) {
			return true;
		}
		return false;
	}

	private static boolean compararStringMenorQue(String s, String s2) {
		int x = s.compareTo(s2);
		if (x == 0) {
			return true;
		} else if (x == -1) {
			return true;
		}
		return false;
	}
}

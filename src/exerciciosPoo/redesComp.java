package exerciciosPoo;

import java.util.Scanner;

public class redesComp {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String[] ip = new String [100];
		String[] nomePc = new String [100];
		String[] marcaPc = new String [100];
		
		
		ip = leString (sc,"Entre com o IP do computador: ");
		nomePc = leString (sc,"Digite o NOME do computador: ");
		marcaPc = leString (sc,"Digite a MARCA do computador: ");
	}
	
	public static String leString(Scanner in, String msg) {
		System.out.print(msg); 
		
		
	}

}

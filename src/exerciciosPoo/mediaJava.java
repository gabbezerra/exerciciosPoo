package exerciciosPoo;

import java.util.Scanner;

public class mediaJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double n1, n2, n3, media;
		String nomeAluno, nomeMateria;


		nomeAluno = leString (sc,"Entre com o nome do aluno: ");
		nomeMateria = leString (sc,"Entre com o nome da materia: ");

		n1 = leDouble (sc,"Entre com a primeira nota: ");
		n2 = leDouble (sc,"Entre com a segunda nota: ");
		n3 = leDouble (sc,"Entre com a terceira nota: ");
		
		
		System.out.print("O nome do aluno é :" + nomeAluno + " sua media na materia " + nomeMateria + " foi "+ media(n1,n2,n3));


	}

	public static String leString(Scanner in, String msg) {

		System.out.print(msg); 
			while(!in.hasNextLine()){
			in.nextLine();
			System.out.print("Tipo de dado inválido. Digite um texto valido: ");
		}
		String r = in.nextLine();
		//in.nextLine();

		return r;
	}
	
	public static double leDouble(Scanner in, String msg) {

		System.out.print(msg); 
			while(!in.hasNextDouble()){
			in.nextLine();
			System.out.print("Tipo de dado inválido. Digite uma nota valida: ");
		}
		double r = in.nextDouble();
		in.nextLine();

		return r;
	}

	public static double media (double n1, double n2, double n3){
		return (n1 + n2 + n3) / 3;

	}
}

package br.unibratec.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unibratec.fachada.Fachada;

public class Console {

	private int[] LerDadosConsole(){

		Scanner scanner = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		System.out.println("Digite um numero e tecle enter. Ao final digite um caracter para executar a operação.");		

		while (true) {
			try {
				list.add(scanner.nextInt());
			} catch (Exception e) {
				break;
			}
		}
		int[] a = new int[list.size()];
		int i = 0;
		for (int val : list) {
			a[i] = val;
			i++;
		}
		return a;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fachada f = Fachada.getInstance();
		Console c = new Console();
		while (true) {
			for (int i = 0; i < 5; i++) {
				System.out.println();
			}
			System.out.println("*****************************************");
			System.out.println("Inicio da calculadora");
			System.out.println("*****************************************");
			System.out.println("Soma : 1");
			System.out.println("Subrai : 2");
			System.out.println("Multiplica : 3");
			System.out.println("Divide : 4");
			System.out.println("Sair : 5");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			Scanner scanner = new Scanner(System.in);
			int entrada1 = scanner.nextInt();
			System.out.println();
			System.out.println();
			if (entrada1 == 5) {
				break;
			}

			int[] a;
			switch (entrada1) {
			case 1:
				System.out.println("Opção soma escolhida.");
				a = c.LerDadosConsole();
				System.out.println("Resultado : "+Fachada.getInstance().soma(a));
				break;
			case 2:
				System.out.println("Opção subtração escolhida.");
				a = c.LerDadosConsole();
				System.out.println("Resultado : "+Fachada.getInstance().subtrai(a));
				break;
			case 3:
				System.out.println("Opção multiplição escolhida.");
				a = c.LerDadosConsole();
				System.out.println("Resultado : "+Fachada.getInstance().multiplica(a));
				break;
			case 4:
				System.out.println("Opção divisão escolhida.");
				a = c.LerDadosConsole();
				try {
					System.out.println("Resultado : "+Fachada.getInstance().divide(a));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			default:
				System.out.println("Nenhuma opção digitada");
				break;
			}

		}

	}

}

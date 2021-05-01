package operadoresLogicos;

import java.util.Scanner;

public class OpTernario4 {
	
	public static void main(String[] args) {
		int num = gostou() ? rotinaEmpolgante1() : rotinaEmpolgante2();
		System.out.println("preço: " + num);
	}
	
	private static boolean gostou() {
		System.out.println("Se você é uma pessoa bonita, digite sim: ");
		Scanner scanner = new Scanner(System.in);
		String opcao = scanner.next();
		scanner.close();
		return opcao.equals("sim") ? true : false;
	}

	private static int rotinaEmpolgante1() {
		System.out.println("escolhida a opção 1");
		System.out.println(".... muita lógica aqui .....");
		return 10;
	}
	
	private static int rotinaEmpolgante2() {
		System.out.println("escolhida a opção 2");
		System.out.println(".... muita lógica aqui .....");
		return 20;
	}
}

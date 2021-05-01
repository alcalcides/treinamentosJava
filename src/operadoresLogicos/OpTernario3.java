package operadoresLogicos;

public class OpTernario3 {
	static final Boolean controle = true;
	
	public static void main(String[] args) {
		int num = controle ? extracted1() : extracted2();
		System.out.println("preço: " + num);
	}
	
	private static int extracted1() {
		System.out.println("escolhida a opção 1");
		System.out.println(".... muita lógica aqui .....");
		return 10;
	}
	
	private static int extracted2() {
		System.out.println("escolhida a opção 2");
		System.out.println(".... muita lógica aqui .....");
		return 20;
	}
}

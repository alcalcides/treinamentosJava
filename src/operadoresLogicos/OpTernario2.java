package operadoresLogicos;

public class OpTernario2 {
	static final Boolean controle = false;
	
	public static void main(String[] args) {		
		int varLegal = rotina();
		int num = controle ? 1 : varLegal;
		System.out.println(num);
	}
	
	private static int rotina() {
		return 2;
	}
}

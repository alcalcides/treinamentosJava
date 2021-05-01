package operadoresLogicos;

public class OpCurtoCircuito {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("\ncaso 1");
		if(1 != 2) {
			System.out.println("1 é diferente de 2");
		}
		
		System.out.println("\ncaso 2");
		Integer x = 10, y = 20;
		if (++x != ++y) {
			System.out.println(x + " é diferente de " + y);
		}
		
		System.out.println("\ncaso 3");
		if (true || ++x != ++y) {
			System.out.println(x + " é diferente de " + y);
		}
		
		if (true | ++x != ++y) {
			System.out.println(x + " é diferente de " + y);
		}
		
		System.out.println("\ncaso 3");
		if(false && rotinaBombástica(x, y)) {
			System.out.println("x é " + x + " e y é " + y);
		}
		
		if(false & rotinaBombástica(x, y)) {
			System.out.println("x é " + x + " e y é " + y);
		}
		
		
	}
	public static Boolean rotinaBombástica(Integer x, Integer y) {
		System.out.println("rotina BOMBÁSTICA");
		return x > y;
	}
}

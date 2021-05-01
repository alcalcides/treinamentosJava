package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<>();
		fila.add(10);
		fila.add(100);
		fila.add(1);
		fila.add(-98);
		
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila.remove()); // dequeue
		System.out.println(fila);
	}
}

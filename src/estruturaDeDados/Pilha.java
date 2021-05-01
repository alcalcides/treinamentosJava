package estruturaDeDados;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack<Integer> pilha = new Stack<>();
		pilha.push(5);
		pilha.push(50);
		pilha.push(25);
		pilha.push(150);
		
		System.out.println(pilha.size());
		System.out.println(pilha.peek());
		System.out.println(pilha.pop());
		System.out.println(pilha.size());
	}
}

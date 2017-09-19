package br.cesed.unifacisa.si.example;

public class MainDeque {
	
	public static void main(String[] args) throws DequeFullException {
		
		Deque arrayDeque = new Deque(3);
		
		arrayDeque.addFirst(1);
		arrayDeque.addLast(3);
		arrayDeque.addFirst(2);
		
		System.out.println(arrayDeque.getFirst());
		System.out.println(arrayDeque.getLast());
		
		arrayDeque.addLast(4);
		
	}

}

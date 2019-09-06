package chapter7;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList	books = new LinkedList();
		books.offer("offer");
		books.push("push");
		books.offerFirst("offerFirst");
		System.out.println(books);
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		System.out.println(books.peekFirst());
		System.out.println(books.peekLast());
		System.out.println(books.pop());
		System.out.println(books);
		System.out.println(books.poll());
		System.out.println(books);
	}

}

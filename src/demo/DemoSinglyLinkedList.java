package demo;

import java.util.LinkedList;

public class DemoSinglyLinkedList {

	public static void main(String[] args) {
		//create Linked list
		LinkedList<String> l1 = new LinkedList<>();
		
		//add elements to LinkedList
		l1.add("A");
		l1.add("B");
		System.out.println("contents of Linkedlist:"+l1);
		l1.add(1, "C");
		l1.addFirst("D");
		l1.addLast("F");
		System.out.println("contents of Linkedlist:"+l1);
		l1.remove(2);
		System.out.println("contents of Linkedlist:"+l1);
		l1.remove("D");
		System.out.println("contents of Linkedlist:"+l1);
		l1.removeFirst();
		System.out.println("contents of Linkedlist:"+l1);
		l1.set(1, "ABC");
		System.out.println("contents of Linkedlist:"+l1);
		
	}
}

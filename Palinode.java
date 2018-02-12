


import java.util.*;

// This checks to see if the LinkedList is a 
// palindrom

public class Palinode {

	public static void main(String[] args) {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('a');

		a.next = b;
		b.next = c;
		c.next = null;

		System.out.println(isPalindrom(a));

	}

	public static boolean isPalindrom(Node node) {

		StringBuilder sb = new StringBuilder();
		String str, str_reverse;

		while (node.next != null) {

			sb.append(node.value);
			node = node.next;
		}
		sb.append(node.value);

		str = sb.toString();
		str_reverse = sb.reverse().toString();
		System.out.println(str);
		System.out.println((str_reverse));
		return str.equals(str_reverse);

	}


	public static class Node {

		public char value;
		public Node next;

		public Node(char value) {
			this.value = value;
			this.next = null;
		}
	}


	
}
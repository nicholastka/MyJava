
import java.util.*;
import java.io.*;
// This returns the the Node kth from the end of the Node

class Fromend {


	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		a.next = b;
		b.next = c;
		c.next = null;

		Node n = kFromEnd(a, 2);

		System.out.println(n.value);
	}

	public static Node kFromEnd(Node ll, int a) {

		Node lead = ll;
		
		int count = lead == null ? 0 : 1;


		while (lead.next != null) {
			lead = lead.next;
			count++;

		}

		int index = count - a;

		lead = ll;

		while(index > 0) {

			lead = lead.next;
			index--;
		}

		return lead;


	}
	public static class Node {

		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}


}


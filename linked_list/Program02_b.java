package linked_list;

public class Program02_b {
	public static class Node {
		int val;
		Node next;

		Node(int val) {
			this.val = val;
		}
	}

	public static class SelfLinkedList {
		Node head = null;
		Node tail = null;

		public void insertAtEnd(int val) {
			Node temp = new Node(val);

			if (head == null) {
				head = temp;
			} else {
				tail.next = temp; // Inserting at the end of the Linked List
			}
			tail = temp;
		}

		// TODO: Recursive Approach
		public void display(Node head) { 
			if (head == null)
				return;
			System.out.print(head.val + " ");
			display(head.next);
		}
	}

	public static void main(String[] args) {
		SelfLinkedList ll = new SelfLinkedList();

		ll.insertAtEnd(100);
		ll.insertAtEnd(50);
		ll.insertAtEnd(24);
		ll.insertAtEnd(13);
		ll.insertAtEnd(65);
		ll.insertAtEnd(97);

		System.out.println("Elements in the Linked List are: ");
		ll.display(ll.head);
	}
}

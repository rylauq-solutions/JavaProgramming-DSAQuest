package linked_list;

public class Program05 {

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
		int size;

		public void display() { // Iterative Approach
			Node temp = head;

			System.out.println("Elements the in Linked List are: ");
			while (temp != null) {
				System.out.print(temp.val + " ");
				temp = temp.next;
			}
		}

		public int getLength() { // Iterative Approach
			Node temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			size = count;
			return count;
		}

		public void insertAtEnd(int val) {
			Node temp = new Node(val);

			if (head == null) {
				head = temp;
			} else {
				tail.next = temp; // Inserting at the end of the Linked List
			}
			tail = temp;
		}

		public void insertAtBeginning(int val) {
			Node temp = new Node(val);

			if (head != null) {
				temp.next = head;
			}
			head = temp;
		}

		public void insertAtIndex(int idx, int val) {
			Node node = new Node(val);
			if (idx == 0) {
				node.next = head;
				head = node;
				return;
			}

			Node temp = head;
			for (int i = 1; i < idx; i++)
				temp = temp.next;

			node.next = temp.next;
			temp.next = node;
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

		ll.display();
		System.out.println("\n====================");
		System.out.print("Length of LL is: " + ll.getLength());
		System.out.println("\n====================");
		ll.insertAtIndex(0, 45);
		ll.insertAtIndex(3, 48);
		ll.insertAtIndex(6, 52);
		ll.display();
		System.out.println("\n====================");
		System.out.print("Length of LL is: " + ll.getLength());
	}
}

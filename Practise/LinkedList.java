
public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void printList() {
		if (head != null) {
			System.out.print(head.data);

			printNode(head.next);
		}
		System.out.println();
	}

	private void printNode(Node node) {
		if (node != null) {
			System.out.print(" ==> " + node.data);

			Node temp = node;
			if (temp.next != null) {
				printNode(temp.next);
			}
		}
	}

	private void addNode(int position, Node newNode) {
		Node temp = head;
		if (position == 0 && head != null) {
			insert(newNode);
			return;
		}

		for (int i = 1; i <= position - 1; i++) {
			if (temp.next != null) {
				temp = temp.next;
			}
		}

		if (temp != null && temp.next != null) {
			newNode.next = temp.next;
			temp.next = newNode;
		} else {
			temp.next = newNode;
		}

		return;
	}

	private void insert(Node newNode) {
		Node temp = head;
		head = newNode;
		newNode.next = temp;
	}

	private void append(Node newNode) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
	}

	private void delete(int data) {
		Node temp = head;
		Node previous = null;

		while (temp.next != null) {
			if (temp.data == data) {
				if (previous == null) {
					head = temp.next;
					return;
				} else {
					previous.next = temp.next;
					return;
				}
			}

			previous = temp;
			temp = temp.next;
		}
	}

	private void deleteNode(int position) {
		Node temp = head;
		Node prev = null;

		for (int i = 0; i <= position; i++) {
			prev = temp;

			if (temp.next != null) {
				temp = temp.next;
			} else {
				prev.next = null;
				return;
			}
		}

		prev.next = temp.next;
		return;
	}

	public static void main(String[] args) {
		Node node1 = new Node(5);
		LinkedList list = new LinkedList();
		list.head = node1;

		Node node2 = new Node(10);
		// node1.next = node2;
		list.append(node2);

		Node node3 = new Node(0);
		list.insert(node3);

		list.addNode(1, new Node(1));
		list.addNode(3, new Node(7));
		list.addNode(6, new Node(15));

		list.append(new Node(20));

		list.printList();

		list.delete(0);
		list.printList();

		list.delete(7);
		list.printList();

		list.deleteNode(0);
		list.printList();

		list.deleteNode(3);
		list.printList();
	}
}

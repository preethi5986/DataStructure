
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
		if(head != null) {
			System.out.print(head.data);
			
			printNode(head.next);
		}
	}
	
	private void printNode(Node node) {
		if(node != null) {
			System.out.print(" ==> " + node.data);
			
			Node temp = node;
			if(temp.next != null) {
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

		for (int i = 0; i <= position; i++) {
			temp = temp.next;
		}

		if (temp.next != null) {
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
	
	public static void main(String[] args) {
		Node node1 = new Node(5);
		LinkedList list = new LinkedList();
		list.head = node1;
		
		Node node2 = new Node(10);
		node1.next = node2;
		
		Node node3 = new Node(0);
		list.insert(node3);
		
		list.addNode(1, new Node(1));
		
		list.printList();
	}
}

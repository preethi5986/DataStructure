
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
	
	public void printList() {
		if(head != null) {
			System.out.print(head.data + " ==> ");
			
			printNode(head.next);
		}
	}
	
	private void printNode(Node node) {
		if(node != null) {
			System.out.print(node.data + " ==> ");
			
			Node temp = node;
			while(temp.next != null) {
				printNode(temp.next);
			}
		}
	}
	
	public void addNode(int position, Node newNode) {
		Node temp = head;
		if(position == 0 && head != null) {
			head = newNode;
			newNode.next = temp;	
			return;
		} 
		
		
		for(int i=0; i <= position-1; i++) {
			temp = temp.next;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(5);
		LinkedList list = new LinkedList();
		list.head = node1;
		
		Node node2 = new Node(10);
		node1.next = node2;
		
		Node node3 = new Node(0);
		list.addNode(0, node3);
		
		list.printList();
	}
}

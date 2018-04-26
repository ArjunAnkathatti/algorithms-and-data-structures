public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.display();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.display();
		System.out.println("length of the list : " + ll.getLength());
	}
}

class LinkedList {
	// pointer to the first node
	private Node head;
	// pointer to the last node
	private Node endNode;
	// length of the list
	private int length;

	public LinkedList() {
		// initiallize both head and end nodes to null
		this.head = null;
		this.endNode = head;
		this.length = 0;
	}

	public void add(int value) {
		//chekc if the linked list is empty
		if (head == null) {
			head = new Node(value);
			// make new node as end node
			endNode = head;
		} else {
			// insert a node at the end 
			endNode.next = new Node(value);
			// make the newly inserted node as the endnode
			endNode = endNode.next;
		}
		this.length++;
	}

	public void display() {
		//chekc if the linked list is empty
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.getValue() + " ");
				currentNode = currentNode.next;
			}
			System.out.println("");
		}
	}

	public int getLength() {
		return this.length;
	}
}

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
		next = null;
	}

	public int getValue() {
		return this.value;
	}
}
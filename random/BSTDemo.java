public class BSTDemo {
	public static void main(String[] args) {

		BST bst = new BST();
		bst.insert(10);
		bst.insert(5);
		bst.insert(15);
		bst.display();

	}

}

class BST{
	Node root;

	public BST() {
		root = null;
	}

	public void insert(int value) {
		if (this.root == null) {
			root = new Node(value);
		} else {
			insert(root, value);
		}
	}

	public void insert(Node currentNode, int value) {
		if (value <= currentNode.value && currentNode.left != null) {
			insert(currentNode.left, value);
		} else if (value <= currentNode.value) {
			currentNode.left = new Node(value);
		} else if (value > currentNode.value && currentNode.right != null) {
			insert(currentNode.right, value);
		} else {
			currentNode.right = new Node(value);
		}
	}

	public void display() {
		System.out.println("In-order printing of BST : ");
		display(this.root);
		System.out.println();
	}

	public void display(Node currentNode) {
		if (currentNode != null) {
			display(currentNode.left);
			System.out.print(currentNode.getValue() + ", ");
			display(currentNode.right);
		}
	}
}

class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}

	public int getValue() {
		return this.value;
	}
}
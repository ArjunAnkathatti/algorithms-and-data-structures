public class Tree {
	public static void main(String[] args){
		Node root = new Node(4);
		Node leftChildOne = new Node(2);
		Node rightChildOne = new Node(6);
		Node leftChildTwo = new Node(1);
		Node rightChildTwo = new Node(3);
		Node leftChildThree = new Node(5);
		Node rightChildThree = new Node(7);

		root.left = leftChildOne;
		root.right = rightChildOne;

		leftChildOne.left = leftChildTwo;
		leftChildOne.right = rightChildTwo;

		rightChildOne.left = leftChildThree;
		rightChildOne.right = rightChildThree;

		System.out.println("Pre order");
		preOrder(root);
		System.out.println("\nIn order");
		inOrder(root);
		System.out.println("\n Post order");
		postOrder(root);
		System.out.println("\nTotal Sum of the tree : " + sum(root));

		greaterTree(root, sum(root));
		System.out.println("\nIn order");
		inOrder(root);
		
	}

	public static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.value + ", ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.value + ", ");
			inOrder(root.right);
		}
	}

	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.value + ", ");
		}
	}

	public static int sum(Node root) {
		if (root != null) {
			return sum(root.left) + root.value + sum(root.right);
		} else {
			return 0;
		}
	}

	public static int greaterTree(Node root, int sum) {

		if (root != null) {
			
			root.value = sum - greaterTree(root.left, sum);
			return greaterTree(root.right, sum);
		} else {
			return 0;
		}

	}
}

class Node {
	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}
}
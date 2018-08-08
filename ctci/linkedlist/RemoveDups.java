import java.util.*;

public class RemoveDups {

	public static void main(String[] args) {
		Node head = new Node(1);

		Node second = new Node(2);

		Node third = new Node(3);

		Node four = new Node(2);

		Node five = new Node(4);

		Node six = new Node(5);


		head.next = second;
		second.next = third;
		third.next = four;
		four.next = five;
		five.next = six;

		System.out.println("before removing duplicates");

		listItems(head);

		//removeDups(head);
		removeDupsRecursion(head);

		System.out.println("after removing duplicates");

		listItems(head);

	}

	public static void listItems(Node head) {
		Node temp = head;

		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}


	public static void removeDups(Node head) {
		// removing duplicate nodes using temporary memory
		ArrayList<Integer> list = new ArrayList<Integer>();

		// initialize the current to the head
		Node cur = head;
		while (cur != null) {
			// add current element to the list
			list.add(cur.value);
			// check if the next node is null or not
			// if not check if the  next node value is already present or not
			if (cur.next != null) {
				if (list.contains(cur.next.value) ){
					// if yes, i.e there is duplicate, 
					// assign next to next to the next
					cur.next = cur.next.next;	
				}
			}
			// increment the current node
			cur = cur.next;
		}
	}


	public static void removeDupsRecursion(Node head) {
		Node upperCur = head;
		int curItem;

		// upper traversal node pointer
		while(upperCur != null) {
			curItem = upperCur.value;
			// inner traversal node pointer
			Node cur =upperCur;
			while(cur != null) {
				if (cur.next !=null && cur.next.value == curItem) {
					cur.next = cur.next.next;
				}
				cur = cur.next;
			}
			upperCur = upperCur.next;
		}
	}

}
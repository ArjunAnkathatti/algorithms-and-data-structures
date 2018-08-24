public class FindLoop {
	public static void main(String[] args) {
		Node first = new Node(1);
		Node second = new Node(2);
		first.next = second;
		Node third = new Node(3);
		second.next = third;
		Node four = new Node(4);
		third.next = four;
		Node five = new Node(5);
		four.next = five;
		Node six = new Node(6);
		five.next = six;
		six.next = second;

		findLoopStart(first);
	}

	public static void findLoopStart(Node head) {
		Node slowRunner = head;
		Node fastRunner = head;
		boolean flag = false;
		boolean isLoopExists = false;

		while (slowRunner != null && fastRunner != null) {
			// when slowRunner and fastRunner meet and 
			// slowRunner and fastRunner are not pointing to the head
			if (slowRunner == fastRunner && flag) {
				slowRunner = head;
				while(slowRunner != null && fastRunner != null) {
					if (slowRunner == fastRunner) {
						System.out.println("loop exists and it begins at : " + slowRunner.value);
						isLoopExists = true;
						// break out of inner while loop
						break;
					}
					slowRunner = slowRunner.next;
					fastRunner = fastRunner.next;
				}
				// break out of outer while loop
				break;
			} else {
				flag = true;
				// increment slowRunner by one step
				slowRunner = slowRunner.next;
				// increment fastRunner by two steps
				if (fastRunner.next != null) {
					fastRunner = fastRunner.next.next;	
				} else {
					fastRunner = fastRunner.next;
				}	// else end
			} // else end
		} // while end

		// if no loop exists then print
		if (!isLoopExists) {
			System.out.println("No loops");
		}
		
	}
}
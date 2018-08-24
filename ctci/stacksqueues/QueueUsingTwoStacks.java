import java.util.*;

public class QueueUsingTwoStacks {

	private Stack<Integer> enStack;
	private Stack<Integer> deStack;
	private int capacity;
	private int size;
	private boolean wasLastOpDeque;

	public QueueUsingTwoStacks(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.enStack = new Stack<Integer>();
		this.deStack = new Stack<Integer>();
		this.wasLastOpDeque = false;
	}

	public static void main(String[] args) {
		QueueUsingTwoStacks q = new QueueUsingTwoStacks(4);
		System.out.println("queue is empyt now so deques operation should return -1");
		System.out.println(q.deQue());
		q.enQue(1);
		q.enQue(2);
		q.enQue(3);
		q.enQue(4);
		System.out.println("queue is full now so enque operation should throw error");
		q.enQue(5);
		q.deQue();
		q.enQue(5);
		System.out.println("5 was inserted");
		q.enQue(6);
		q.deQue();
		q.deQue();
		q.deQue();
		q.deQue();
		q.deQue();
	}

	public void enQue(int value) {
		if (isQueueFull()) {
			System.out.println("Queue is full");
		} else {
			if (wasLastOpDeque) {
				move(deStack, enStack);
			}
			enStack.push(value);
			wasLastOpDeque = false;
			size++;
		} // else end
	} // enQue end

	public int deQue() {
		if (isQueueEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			if (!wasLastOpDeque) {
				move(enStack, deStack);
			}
			wasLastOpDeque = true;
			size--;
			return (Integer) deStack.pop();
		} // else end
	} // deQue end

	public boolean isQueueEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isQueueFull() {
		if (size == capacity) {
			return true;
		} else {
			return false;
		}
	}

	public void move(Stack<Integer> src, Stack<Integer> dest) {
		for (int i=1; i<= size; i++) {
			dest.push(src.pop());
		}
	}


}
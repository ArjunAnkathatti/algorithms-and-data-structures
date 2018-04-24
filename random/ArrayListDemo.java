public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		// insert some elements in to the ArrayList
		for(int i=10; i<=50; i+=2) {
			ar.append(i);
		}

		// print the element in the ArrayList
		ar.displayElements();

		// print no of elements in the ArrayList
		System.out.println("No of elements : " + ar.length());
	}
}

class ArrayList {
	int[] arr;
	int currentIndex;

	public ArrayList() {
		// default constructor initialize with size = 1
		// initialize the currentIndex to -1
		arr = new int[1];
		currentIndex = -1;
	}

	public ArrayList(int size) {
		// when initial size is given initialize the arr with the size
		arr = new int[size];
		// initialize the currentIndex to -1
		currentIndex = -1;
	}

	public void append(int item) {
		// check if array is full i.e current index is equal to length of the array
		// if array is not full increment the currentIndex first and insert the item 
		// and then increment the current index
		if(currentIndex < arr.length-1) {
			arr[++currentIndex] = item;
		} else {
			// if arr is full create a new array with double the size of the current array
			int[] temp = new int[arr.length *2];
			int i;
			// copy all the items in the existing array in to new array
			for(i= 0; i<arr.length; i++) {
				temp[i] = arr[i];
			}
			// insert the item at the end and increment the currentIndex
			temp[i] = item;
			currentIndex = i;
			// make the temp array as the array of the class
			this.arr = temp;
		}
	}

	public void displayElements() {
		// display all the element in the array
		for(int i=0; i<=currentIndex; i++) {
			System.out.print(arr[i] + " ");
		}
		// print new line character
		System.out.println("");
	}

	public int length() {
		return currentIndex +1;
	}
}
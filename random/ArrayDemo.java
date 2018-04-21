public class ArrayDemo {
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5};
		int [] nums = new int[0];
		System.out.println(nums.length);
		System.out.println(numbers.length);
		System.out.println("hello!, Welcome to arrays");
		System.out.println("this is your first array");
		display(numbers);
		displayTwo(numbers);
	}

	public static void display(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("");
	}

	public static void displayTwo(int[] arr) {
		for(int i : arr) {
			System.out.print(i);
		}
	}
}

public class Fibonacci {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.printf("%dth fibonacci number is : %d\n", 40, fibonacci(40));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime)/1000000000.0 + " s");
	}

	public static int fibonacci(int num) {
		int[] fact = new int[num+1];
		return fibonacci(num, fact);
	}

	// factorial using memozization
	public static int fibonacci(int num, int[] fact) {
		if (num == 0) {
			return 0;
		} else if (num ==1) {
			return 1;
		} else if (fact[num] != 0) {
			return fact[num];
		} else {
			fact[num] = fibonacci(num - 1, fact) + fibonacci(num - 2, fact);
			return fact[num];
		}
	}
	
}
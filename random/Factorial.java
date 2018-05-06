public class Factorial {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.printf("Factorial of %d is : %d\n", 10, factorial(10));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime)/1000000000.0 + " s");
	}

	public static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
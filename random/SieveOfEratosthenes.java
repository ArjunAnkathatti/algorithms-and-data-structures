public class SieveOfEratosthenes {

	public static void main(String [] args) {
		int N = 1000000;
		
		printPrimeNumLessThanNum(N);
	}

	public static void printSumOfPrimeNumLessThanNum(int n) {
		boolean[] prime = new boolean[n+1];

		// initalize the array to ture value
		for(int i=2; i<n; i++) {
			prime[i] = true;
		} // for loop end

		for (int p=2; p*p <= n; p++) {

			if (prime[p]) {
				for (int i=p*2; i<=n; i=i+p) {
					prime[i] = false;
				} // inner for loop end
			} // if condition end

		} // for loop end

		/***
		Printing all the prime numbers
		***/
		long sum = 0;
		int count = 0;
		for (int i=2; i<=n; i++) {
			if(prime[i]) {
				System.out.println(i);
				sum += i;
				count++;
			}
		} // for loop end

		// print the sum of all prime numbers less than n
		System.out.printf("There are %d numbers and Sum = %d\n", count, sum);

	} // function printPrimeNumLessThanNum end
	
}
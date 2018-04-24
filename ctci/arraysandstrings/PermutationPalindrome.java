public class PermutationPalindrome {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide command line argument");
			System.out.println("Usage: java PermutationPalindrome \"sample string\"");
		} else {
			if (isPermutationPalindrome(args[0])) {
				System.out.println("true: one of the permutation is a palindrome");
			} else {
				System.out.println("false: no permutation of this string can be a palindrome");
			}
		}
	}

	public static boolean isPermutationPalindrome(String str) {
		int[] charCount = new int[26];
		int index;
		int aCharValue = Character.getNumericValue('a');
		for(char c : str.toCharArray()) {
			if (c != ' ') {
				index = Character.getNumericValue(c) - aCharValue;
				charCount[index]++;
			}
				
		}
		return hasMoreOddCounts(charCount);
	}

	public static boolean hasMoreOddCounts(int[] arr) {
		int oddCount = 0;
		for(int item: arr) {
			if (item%2 != 0)
				oddCount++;
			if (oddCount > 1)
				return false;
		}
		return true;
	}
	

}
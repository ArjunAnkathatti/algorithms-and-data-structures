public class StringPermutation {
	public static void main(String[] args) {
		permutation("abc", "");
	}

	public static void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i=0; i< str.length(); i++) {
				String rem = str.substring(0,i) + str.substring(i+1);
				String temp = prefix + str.charAt(i);
				permutation(rem, temp); 
			}
		}
	}
}
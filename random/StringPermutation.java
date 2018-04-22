public class StringPermutation {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide command line argument");
			System.out.println("Usage: java Permutation \"sample string\"");
		} else {
			permuation(args[0]);	
		}
		
	}

	public static void permuation(String str) {
		permuation(str, "");
	}

	public static void permuation(String str, String prefix) {
		int strLength = str.length();
		if (strLength == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < strLength; i++) {
				String rem = str.substring(0,i) + str.substring(i+1, strLength);
				permuation(rem, prefix + str.charAt(i));
			}
		}
	}
}
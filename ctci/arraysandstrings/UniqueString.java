public class UniqueString {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide command line argument");
			System.out.println("Usage: java UniqueString \"sample string\"");
		} else {
			if (hasUniqueCharacters(args[0]))
				System.out.println("unique");
			else 
				System.out.println("not unique");
		}
	}

	public static boolean hasUniqueCharacters(String str) {
		boolean[] charSet = new boolean[128];
		for (int i=0; i < str.length(); i++) {
			if(charSet[str.charAt(i)])
				return false;
			charSet[str.charAt(i)] = true;
		}	
		return true;
	}
	
}
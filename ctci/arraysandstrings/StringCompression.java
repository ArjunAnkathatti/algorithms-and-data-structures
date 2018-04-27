public class StringCompression {

	public static void main(String[] args) {
		String str = "abccccc";
		System.out.println(compressString(str));
	}

	public static String compressString(String str) {
		char[] letters = str.toCharArray();
		int charCount = 1;
		StringBuilder comStr = new StringBuilder();
		int i;
		for ( i=0; i < str.length() -1; i++) {
			if (letters[i] == letters[i+1]) {
				charCount++;
			} else {
				comStr.append(letters[i]);
				comStr.append(charCount);
				charCount = 1;
			}
		}
		comStr.append(letters[i]);
		comStr.append(charCount);
		if (str.length() <= comStr.toString().length()) {
			return str;
		} else {
			return comStr.toString();
		}
	}
}
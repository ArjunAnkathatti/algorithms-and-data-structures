public class Urlify {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide command line argument");
			System.out.println("Usage: java Urlify \"sample string\" trueLength");
		} else {
			try {
				int trueLen = Integer.parseInt(args[1]);	
				System.out.println(urlify(args[0], trueLen));
			} catch (NumberFormatException e){
				System.out.println("second parameter is not a number");
			}
	}
}

	public static String urlify(String str, int trueLen) {
		char[] charArr = str.toCharArray();
		int j = charArr.length - 1;
		int i = trueLen - 1;
		while(i != j) {
			if(charArr[i] != ' ') {
				charArr[j--] = charArr[i];
			}
			else {
				charArr[j--] = '0';
				charArr[j--] = '2';
				charArr[j--] = '%';
			}
			i--;
		} // while
		return new String(charArr);
	}// function
	
}
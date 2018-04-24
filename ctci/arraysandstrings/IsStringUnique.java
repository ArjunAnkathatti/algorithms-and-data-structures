public class IsStringUnique {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide command line argument");
			System.out.println("Usage: java IsStringUnique \"sample string\"");
		} else {
			HastTable ht = new HastTable();
			boolean isUnique = true;
			for (char c : args[0].toCharArray()) {
				isUnique = ht.insert(c);
				if(isUnique == false)
					break;
			}
			if(isUnique)
				System.out.println("string is unique");
			else
				System.out.println("string is not unique");
		}
	}
}

class HastTable {
	char[] letters;

	public HastTable() {
		letters = new char[26];
	}

	public boolean insert(char c) {
		int ascii = (int) c;
		int index = ascii % 96;

		if (letters[index] != '\0')
			return false;
		letters[index] = c;
		return true; 
	}
}
public class OneEditString {
	public static void main(String[] args) {
		String str1 = "pale";
		String str2 = "bake";

		System.out.println(areStringsOneEditAway(str1, str2));
	}

	public static boolean areStringsOneEditAway(String str1, String str2) {
		if (str1.length() == str2.length()) {
			int i,j,count;
			i=j=count=0;
			while(i < str1.length() && j < str2.length()) {
				if(str1.charAt(i) != str2.charAt(j))
					count++;
				if (count > 1)
					return false;
				i++;
				j++;
			}
			return true;
		} else if (Math.abs(str1.length() - str2.length()) == 1) {
			int i,j,count;
			i=j=count=0;
			while(i < str1.length() && j < str2.length()) {
				if (str1.charAt(i) != str2.charAt(j)){
					count++;
					if (str1.length() > str2.length()){
						i++;
					} else {
						j++;
					}
				} else {
					i++;
					j++;
				}
				if (count > 1){
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
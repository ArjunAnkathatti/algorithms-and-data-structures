public class SubString {
	public static void main(String[] args) {
		String src = "ilovemizzou";
		String subStr = "mizzou";

		src = src + src;
		if (src.contains(subStr)) {
			System.out.println("substring is present in the main string");
		} else {
			System.out.println("substring is not present in the main string");
		}
	}
}
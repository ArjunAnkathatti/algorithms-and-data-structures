import java.util.HashMap;
public class Demo {

	public static void main(String[] args) {
		char[] chArr = new char[3];
		if (chArr[1] == '\0') {
			System.out.println("true");
		}
		System.out.println(chArr[1]);


		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('c', 2);
		System.out.println(map.get('c'));
		System.out.println(map.containsKey('c'));
	}

}
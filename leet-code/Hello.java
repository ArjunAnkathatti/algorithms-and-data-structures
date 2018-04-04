import java.util.Scanner;
public class Hello {
	public static void main(String [] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		System.out.println("your age is : " + age);
}
}

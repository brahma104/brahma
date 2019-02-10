package pkg1;
import pkg2.B;
import java.util.*;

public class A {
	public static void main(String[] args) {
		B b = new B();
		String message = b.getMessage();
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}
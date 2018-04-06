import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		Scanner number2 = new Scanner(System.in);
		int b = number2.nextInt();
		System.out.println(Subtraction (a, b));
		System.out.println(Division (a, b));
		System.out.println(Multiplication (a, b));
		System.out.println(Addition (a, b));
		

	}

	public static int Subtraction (int a, int b) {
		
		return a - b;
	}
	
	public static int Division (int a, int b) {
		
		return a/b;
}
	public static int Multiplication (int a, int b) {
		
		return a*b;
}
	public static int Addition (int a, int b) {
		
		return a+b;
}
}

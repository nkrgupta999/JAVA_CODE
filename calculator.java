import java.util.*;

public class calculator {

	public static void addition(int a, int b) {
		int add = a + b;
		System.out.println("Calculation is Done ");
		System.out.println("Result :" + add);
	}

	public static void subtraction(int a, int b) {
		int sub = a - b;
		System.out.println("Calculation is Done ");
		System.out.println("Result :" + sub);
	}

	public static void multiplication(int a, int b) {
		int mul = a * b;
		System.out.println("Calculation is Done ");
		System.out.println("Result :" + mul);
	}

	public static void division(int a, int b) {
		int div = a / b;
		System.out.println("Calculation is Done ");
		System.out.println("Result :" + div);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<------------Welcome in Core Calculator----------->");
		System.out.println(
				"*****IN THIS CALCULATOR YOU HAVE ONLY CALCULATION OF TWO NUMBER IN the FORM of INTEGER ***** ");
		System.out.println(
				"Select Option According to your choice :-\n1.Addition\n2.Subtraction\n3.Multiplication\n4.DDDivision");
		int option = sc.nextInt();
		switch (option) {
			case 1:
				System.out.println("Enter your first(1st) number for addition :");
				int a = sc.nextInt();
				System.out.println("Enter your second(2nd) number for addition :");
				int b = sc.nextInt();
				addition(a, b);
				break;
			case 2:
				System.out.println("Enter your first(1st) number for subtraction :");
				int c = sc.nextInt();
				System.out.println("Enter your second(2nd) number for Subtraction :");
				int d = sc.nextInt();
				subtraction(c, d);
				break;
			case 3:
				System.out.println("Enter your first(1st) number for Multiplication :");
				int e = sc.nextInt();
				System.out.println("Enter your second(2nd) number for Multiplication :");
				int f = sc.nextInt();
				addition(e, f);
				break;
			case 4:
				System.out.println("Enter your first(1st) number for Division :");
				int g = sc.nextInt();
				System.out.println("Enter your second(2nd) number for Division :");
				int h = sc.nextInt();
				addition(g, h);
				break;

			default:
				System.out.println("----------------INVALID CHOICE-----------------");
		}
		System.out.println("------------------THE END-----------------");
		sc.close();
	}

}

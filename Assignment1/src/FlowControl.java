import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Number = new Scanner(System.in);

		System.out.println("Hello, say a number, I say whether prime number or not: ");

		int n = Number.nextInt();

		boolean primeFlag = true;



		for (int x = 2; x <= n - 1; x++) {

		if (n % x == 0) {

		primeFlag = false;

		}

		}



		if (primeFlag) {

		System.out.println("Prime Number");

		} else {

		System.out.println("Not a prime number");

		}
	}

}

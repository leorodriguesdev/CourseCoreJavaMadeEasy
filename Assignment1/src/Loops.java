import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Number = new Scanner(System.in);

		System.out.println("Say a number: ");

		int n = Number.nextInt();

		int x = 1;

		for (x = 1; x <= n; x++) {

		if (x % 10 == 0) {

		continue;
		}

		if (x > 100) {
		break;

		}

		System.out.println(x);

		} 
		while (x <= n) {

		if (x % 10 == 0) {

		x++;

		continue;

		}

		if (x > 100) {

		break;

		}

		System.out.println(x++);

		}

		do {

		if (x == 100) {

		break;

		}

		if (x % 10 == 0) {

		x++;

		continue;

		}

		System.out.println(x++);

		} while (x <= n);   

	}

}

package SeleniumBeginer;

public class PrintPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i , j;

		System.out.println("The prime no are");

		for (i = 1; i <= 1000; i++) {

			for (j = 2; j <= 1000; j++) {

				if (i % j == 0 && i != j) {

					break;
				}

			}
			if (i % j != 0) {

				System.out.println(i);

			}

		}

	}
}
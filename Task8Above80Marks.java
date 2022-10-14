package SeleniumBeginer;

public class Task8Above80Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 78, 12, 89, 55, 35 };

		System.out.println("Students Marks Who have scored above 80 is :");

		for (int i = 0; i < A.length; i++) {

			if (A[i] > 80) {
				System.out.println(A[i]);
			}
		}

	}

}

package SeleniumBeginer;

public class Task9BreakExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int C[] = { 12, 34, 66, 85, 900 };

		for (int i = 0; i < C.length; i++) {
			if (C[i] == 85)
				break;
			System.out.println(C[i]);

		}

	}

}

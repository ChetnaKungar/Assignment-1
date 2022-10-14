package SeleniumBeginer;

public class Task10BreakExecutionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String B[]= {"Java","JavaScript","Selenium","Python","Mukesh"};
		
		for(int i=0;i<B.length;i++) {
			
			if(B[i]=="Selenium")
				break;
			
			System.out.println(B[i]);
		}

	}

}

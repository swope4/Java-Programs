package FinalExam;

public class gradesMain {

	public static void main(String[] args) {
		javahistclass classes = new javahistclass();
		//People peeps = new People();
		
		
	
		//String insertStatement;
		
		
		
		
		//	System.out.println(peopleAndClass);
			String insertStatement = classes.insertNames();
			System.out.println(insertStatement);
			String peopleAndClass = classes.historyAndJava();
			System.out.println(peopleAndClass);
		
	}
	}



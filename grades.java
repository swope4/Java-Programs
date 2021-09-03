package FinalExam;

public class grades {

	private int Assignment1;
	private int Assignment2;
	private int Assignment3;
	private int Assignment4; 
	private int Exam1;
	private int Exam2;
	
	grades(){
		
	}
	grades(int Assignment1, int Assignment2, int Assignment3,int Assignment4, int Exam1, int Exam2){
		this.Assignment1=Assignment1;
		this.Assignment2=Assignment2;
		this.Assignment3=Assignment3;
		this.Assignment4=Assignment4;
		this.Exam1=Exam1;
		this.Exam2=Exam2;
	}
	public int getAssignment1() {
		return Assignment1;
	}
	public void setAssignment1(int assignment1) {
		Assignment1 = assignment1;
	}
	public int getAssignment2() {
		return Assignment2;
	}
	public void setAssignment2(int assignment2) {
		Assignment2 = assignment2;
	}
	public int getAssignment3() {
		return Assignment3;
	}
	public void setAssignment3(int assignment3) {
		Assignment3 = assignment3;
	}
	public int getAssignment4() {
		return Assignment4;
	}
	public void setAssignment4(int assignment4) {
		Assignment4 = assignment4;
	}
	public int getExam1() {
		return Exam1;
	}
	public void setExam1(int exam1) {
		Exam1 = exam1;
	}
	public int getExam2() {
		return Exam2;
	}
	public void setExam2(int exam2) {
		Exam2 = exam2;
	}
	
	
}

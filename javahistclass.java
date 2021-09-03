package FinalExam;

import java.util.Scanner;

public class javahistclass {

	

	public String insertNames() {
		System.out.println("Type the 5 Names followed by enter: ");//opening method statement
	return " ";
	}
	
	public String historyAndJava() { //method named history and java
		People names1 = new People();//constructor called to access peoples names
		String x = "The students Listed in history are as follows"; //history students list
		String z = "java";//java string for calling java next to the students name
		String y = "history";//history string for calling histoty next to student
		Scanner scan = new Scanner (System.in); // scanner to accept input
		String name = scan.nextLine(); //using name variable to allow input 
		names1.setName1(name); //input the object names1 for input to setter 
		name = scan.nextLine();//same as follows 
		names1.setName2(name);
		name = scan.nextLine();
		names1.setName3(name);
		name = scan.nextLine();
		names1.setName4(name);
		name = scan.nextLine();
		names1.setName5(name);
		
	
		System.out.println(x); //output history statemnt statement
	System.out.println(y+" "+names1.getName1());	//outpupting the student in hist class
	System.out.println(y+" "+names1.getName2());	//same as follows
	System.out.println(y+" "+names1.getName3());
	System.out.println(y+" "+names1.getName4());
	System.out.println(y+" "+names1.getName5());
	String z1 = "The students in java are..";  // outputting java statement
	System.out.println(z1);						//outputting java statement 
	System.out.println(z+" "+names1.getName1());//outputting jaava students 
	System.out.println(z+" "+names1.getName2());//same as follows
	System.out.println(z+" "+names1.getName3());
	System.out.println(z+" "+names1.getName4());
	System.out.println(z+" "+names1.getName5());
	
	String x1 = "The grades for the students in history";
	System.out.println(x1); //output history statement statement
	
	System.out.println("Enter four grades");
	grades grad = new grades();
	
	int grade = scan.nextInt();
	//asks for the grades
	grad.setAssignment1(grade);
	grade = scan.nextInt();
	grad.setAssignment2(grade);
	grade = scan.nextInt();
	grad.setAssignment3(grade);
	grade = scan.nextInt();
	grad.setAssignment4(grade);
	grade = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade);
	grade = scan.nextInt();
	grad.setExam2(grade);
	grade = scan.nextInt();
	
	
	//tots the grades
	int tot = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot2 = grad.getExam1() + grad.getExam2();
	int tot3 = tot/60 + tot2/40;
	
	//outputs the grades
	System.out.println(y+" "+names1.getName1()+" "+tot3);//outputting the student in hist class
	
	
	
	System.out.println("Enter the four grades");
	int grade2 = scan.nextInt();
	grad.setAssignment1(grade2);
	grade2 = scan.nextInt();
	grad.setAssignment2(grade2);
	grade2 = scan.nextInt();
	grad.setAssignment3(grade2);
	grade2 = scan.nextInt();
	grad.setAssignment4(grade2);
	grade2 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade2);
	grade2 = scan.nextInt();
	grad.setExam2(grade2);
	grade2 = scan.nextInt();
	
	
	int tot4 =grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot5 = grad.getExam1() + grad.getExam2();
	int tot6 = tot4/60 + tot5/40;
	
	System.out.println(y+" "+names1.getName2()+" "+tot6);
	
	
	System.out.println("Enter the four grades");
	int grade3 = scan.nextInt();
	grad.setAssignment1(grade3);
	grade3 = scan.nextInt();
	grad.setAssignment2(grade3);
	grade3 = scan.nextInt();
	grad.setAssignment3(grade3);
	grade3 = scan.nextInt();
	grad.setAssignment4(grade3);
	grade3 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade3);
	grade3 = scan.nextInt();
	grad.setExam2(grade3);
	grade3 = scan.nextInt();

	
	int tot7 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot8 = grad.getExam1() + grad.getExam2();
	int tot9 = tot7/60 + tot8/40;
	
	System.out.println(y+" "+names1.getName3()+" "+tot9);
	
	
	System.out.println("Enter the four grades");
	int grade4 = scan.nextInt();
	grad.setAssignment1(grade4);
	grade4 = scan.nextInt();
	grad.setAssignment2(grade4);
	grade4 = scan.nextInt();
	grad.setAssignment3(grade4);
	grade4 = scan.nextInt();
	grad.setAssignment4(grade4);
	grade4 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade4);
	grade4 = scan.nextInt();
	grad.setExam2(grade4);
	grade4 = scan.nextInt();
	
	
	int tot10 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot11 = grad.getExam1() + grad.getExam2();
	int tot12 = tot10/60 + tot11/40;
	System.out.println(y+" "+names1.getName4()+" "+tot12);
	

	System.out.println("Enter the four grades");
	int grade5 = scan.nextInt();
	grad.setAssignment1(grade5);
	grade5 = scan.nextInt();
	grad.setAssignment2(grade5);
	grade5 = scan.nextInt();
	grad.setAssignment3(grade5);
	grade5 = scan.nextInt();
	grad.setAssignment4(grade5);
	grade5 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade5);
	grade5 = scan.nextInt();
	grad.setExam2(grade5);
	grade5 = scan.nextInt();
	
	
	
	int tot13 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot14 = grad.getExam1() + grad.getExam2();
	int tot15 = tot13/60 + tot14/40;
	
	System.out.println(y+" "+names1.getName5()+" "+tot15);
	
	String z2 = "The students in javas grades are entered here..";  // outputting java statement
	
	System.out.println("Enter four grades");
	System.out.println(z2);						//outputting java statement 
	
	int grade22 = scan.nextInt();
	
	grad.setAssignment1(grade22);
	grade22 = scan.nextInt();
	grad.setAssignment2(grade22);
	grade22 = scan.nextInt();
	grad.setAssignment3(grade22);
	grade22 = scan.nextInt();
	grad.setAssignment4(grade22);
	grade22 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade22);
	grade22 = scan.nextInt();
	grad.setExam2(grade22);
	grade22 = scan.nextInt();
	
	
	int tot0 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot22 = grad.getExam1() + grad.getExam2();
	int tot33 = tot0/80 + tot22/20;
	
	System.out.println(z+" "+names1.getName1()+" "+tot33);//outputting jaava students
	
int grade23 = scan.nextInt();
	
	grad.setAssignment1(grade23);
	grade23 = scan.nextInt();
	grad.setAssignment2(grade23);
	grade23 = scan.nextInt();
	grad.setAssignment3(grade23);
	grade23 = scan.nextInt();
	grad.setAssignment4(grade23);
	grade23 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade23);
	grade23 = scan.nextInt();
	grad.setExam2(grade23);
	grade23 = scan.nextInt();
	
	
	int tot00 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot23 = grad.getExam1() + grad.getExam2();
	int tot31 = tot00/80 + tot23/20;
	
	System.out.println(z+" "+names1.getName2()+" "+tot31);//same as follows
	
int grade24 = scan.nextInt();
	
	grad.setAssignment1(grade24);
	grade24 = scan.nextInt();
	grad.setAssignment2(grade24);
	grade24 = scan.nextInt();
	grad.setAssignment3(grade24);
	grade24 = scan.nextInt();
	grad.setAssignment4(grade24);
	grade24 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade24);
	grade24 = scan.nextInt();
	grad.setExam2(grade24);
	grade24 = scan.nextInt();
	
	
	int tot01 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot24 = grad.getExam1() + grad.getExam2();
	int tot32 = tot01/80 + tot24/20;
	
	
	System.out.println(z+" "+names1.getName3()+" "+tot32);
	
int grade25 = scan.nextInt();
	
	grad.setAssignment1(grade25);
	grade25 = scan.nextInt();
	grad.setAssignment2(grade25);
	grade25 = scan.nextInt();
	grad.setAssignment3(grade25);
	grade25 = scan.nextInt();
	grad.setAssignment4(grade25);
	grade25 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade25);
	grade25 = scan.nextInt();
	grad.setExam2(grade25);
	grade25 = scan.nextInt();
	
	
	int tot02 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot25 = grad.getExam1() + grad.getExam2();
	int tot35 = tot02/80 + tot25/20;
	
	System.out.println(z+" "+names1.getName4()+" "+tot35);
	
int grade26 = scan.nextInt();
	
	grad.setAssignment1(grade26);
	grade26 = scan.nextInt();
	grad.setAssignment2(grade26);
	grade26 = scan.nextInt();
	grad.setAssignment3(grade26);
	grade26 = scan.nextInt();
	grad.setAssignment4(grade26);
	grade26 = scan.nextInt();
	System.out.println("Enter the 2 exams");
	grad.setExam1(grade26);
	grade26 = scan.nextInt();
	grad.setExam2(grade26);
	grade26 = scan.nextInt();
	
	scan.close(); //closes scanner 
	int tot04 = grad.getAssignment1() + grad.getAssignment2() + grad.getAssignment3()+grad.getAssignment4();
	int tot26 = grad.getExam1() + grad.getExam2();
	int tot36 = tot04/80 + tot26/20;
	
	System.out.println(z+" "+names1.getName5()+" "+tot36);
	
	
		return " ";
		
	}
	}


package FinalExam;


public class People {
		private String Name1;//instance variables for the names to construct the code
		private String Name2;
		private String Name3;
		private String Name4;
		private String Name5;
		
		People(){ //first constructor function for functionality of the program
			
		}
		
	 People(String Name1, String Name2, String Name3 , String Name4,String Name5){
		
		this.Name1=Name1; //second constructor function for ability to use the..
		this.Name2=Name2; // instance variables.
		this.Name3=Name3;
		this.Name4=Name4;
		this.Name5=Name5;
	
	}

	public String getName1() { //the list of setters and getters used to 
								//so i can allocate memory in the javahistclass
		return Name1;
	}

	public void setName1(String name1) { 
		
		
		Name1 = name1;
	
	}

	public String getName2() {
	
		return Name2;
	}

	public void setName2(String name2) {
		Name2 = name2;
	
	}

	public String getName3() {
	
		return Name3;
	}

	public void setName3(String name3) {
		
		Name3 = name3;
	}

	public String getName4() {
		
		return Name4;
	}

	public void setName4(String name4) {
	
		Name4 = name4;
	}

	public String getName5() {
		
		return Name5;
	}

	public void setName5(String name5) {
		
		Name5 = name5;
	
	}
	
}



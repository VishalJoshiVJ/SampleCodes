package pms;

import java.util.Scanner;

public class Student extends User {
	String stdName, stdUsn, stdAddress, stdEmailId;
	int rollNo;
	
	Scanner in = new Scanner(System.in);
	
	 void getStudentOperation() {		/*Determines which method to be called in this class*/
			String usn;
			int choice;
			
			System.out.println("Select operation : ");
			System.out.println("1.Add Student   2.Edit Student   3.Display Student Details	4.EXIT");
			choice = in.nextInt();
			switch(choice) {
			case 1 : s[++stdCount] = new Student();
					 s[stdCount].addStudent();
					 s[stdCount].displayDetails();
					 break;
			case 2 : System.out.println("Enter USN of Student : ");
					 usn = in.next();
					 for(int j=0 ; j<=stdCount ; j++) {
						 if(s[j].stdUsn.equals(usn)) {
							 s[j].editStudent();
							 s[j].displayDetails();
							 break;
						 }
					 }
					 break;
			case 3 :  System.out.println("Enter USN of Student : ");
			 		 usn = in.next();
			 		 for(int j=0 ; j<=stdCount ; j++) {
			 			 if(s[j].stdUsn.equals(usn)) {
			 				 s[j].displayDetails();
			 				 break;
			 			 }
			 		 }
			 		 break;
			case 4 : System.out.println("Exited Successfully!!");
					 System.exit(0);
			 default : System.out.println("Invalid choice...Program Exited!!");
			 		   break;
			}
		}
	
	void addStudent() {			/*Adds new student*/
		
		System.out.println("Enter Name of the Student	 : ");
		stdName = in.nextLine();
		System.out.println("Enter USN of the Student 	 : ");
		stdUsn = in.nextLine();
		System.out.println("Enter Address of Student 	 :  ");
		stdAddress = in.nextLine();
		System.out.println("Enter Roll number of Student : ");
		rollNo = in.nextInt();
		System.out.println("Enter Email ID of Student 	 :");
		stdEmailId = in.next();
		System.out.println("Student added successfully...");
	}
	
	void editStudent() {		/*Edites student info*/
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.println("Select the information to be edited :");
		System.out.println("1.Name		2.USN		3.Address		4.Roll Number		5.Email ID");
		choice = in.nextInt();
		switch(choice) {
		case 1 : System.out.println("Enter the Name : ");
				 stdName = in.next();
				 System.out.println("Name edited successfully...");
				 break;
		case 2 : System.out.println("Enter the USN : ");
				 stdUsn = in.next();
				 System.out.println("USN edited successfully...");
				 break;
		case 3 : System.out.println("Enter the Address : ");
				 stdAddress = in.next();
				 System.out.println("Address edited successfully...");
				 break;
		case 4 : System.out.println("Enter Roll Number : ");
				 rollNo = in.nextInt();
				 System.out.println("Roll Number edited successfully...");
				 break;
		case 5 : System.out.println("Enter Email ID : ");
				 stdEmailId = in.next();
				 System.out.println("Email ID edited successfully...");
				 break;
		default : System.out.println("Invalid choice...");
				  break;
		}
		
	}
	
	void displayDetails() {			
		
		System.out.println("Name 		: "+stdName);
		System.out.println("USN  		: "+stdUsn);
		System.out.println("Address 	: "+stdAddress);
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Email ID    :"+stdEmailId);
		getOperation();		/*Calls method in the User class to determine further operation*/
	}

}

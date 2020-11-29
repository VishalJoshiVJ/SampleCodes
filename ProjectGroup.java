package pms;

import java.util.Scanner;

public class ProjectGroup extends User {
	String[] stdName = new String[4];
	String[] stdUsn  = new String[4];
	
	Scanner in = new Scanner(System.in);
	
	void getGroupOperation() {			/*Determines which method to be called in this class*/
		String usn;
		int choice, n;
		
		System.out.println("Select operation : ");
		System.out.println("1.Add Group   2.Edit Group   3.Display Group Details	4.EXIT");
		choice = in.nextInt();
		switch(choice) {
		case 1 : g[++grpCount] = new ProjectGroup();
				 g[grpCount].addGroup();
				 g[grpCount].displayGroup();
				 break;
		case 2 : System.out.println("Enter the group number : ");
				 n = in.nextInt();
				 g[n].addGroup();
				 g[n].displayGroup();
				 break;
		case 3 : System.out.println("Enter group number : ");
				 n = in.nextInt();
				 g[n].displayGroup();
				 break;
		case 4 : System.out.println("Exited Successfully!!");
				 System.exit(0);
		default : System.out.println("Invalid choice...Program Exited!!");
 		   		  break;
		}
	}
	
	void addGroup() {		/*Adds new group*/
		System.out.println("Enter the names of 4 students in a Group : ");
		for(int i=0 ; i<stdName.length ; i++) {
			stdName[i] = in.nextLine();
		}
		System.out.println("Enter the USN's of 4 students in a Group : ");
		for(int i=0 ; i<stdName.length ; i++) {
			stdUsn[i] = in.nextLine();
		}
		System.out.println("Group added successfully...");
	}
	
	void displayGroup() {
		System.out.println("Names of Students : ");
		for(int i=0 ; i<stdName.length ; i++) {
			System.out.println(stdName[i]);
		}
		System.out.println("USN's of Students : ");
		for(int i=0 ; i<stdName.length ; i++) {
			System.out.println(stdUsn[i]);
		}
		getOperation();						/*Calls method in the User class to determine further operation*/
	}

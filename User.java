package pms;

import java.util.Scanner;

public class User {
	int stdCount=-1, grpCount=0;
	Student[] s = new Student[50];
	ProjectGroup[] g = new ProjectGroup[30];
	static Student st = new Student();
	static ProjectGroup pg = new ProjectGroup();
	
	
	 static void getOperation() {		/*Determines which class to be used*/
			int choice;
			Scanner in = new Scanner(System.in);
			System.out.println("Select the type of operation :");
			System.out.println("1.Student  2.Group  3.Guide  4.Project  5.Presentation  6.Report  7.Final Marks  8.EXIT");
			choice = in.nextInt();
			switch(choice) {
			case 1 : st.getStudentOperation();
					 break;
			case 2 : pg.getGroupOperation();
			 		 break;
			/*case 3 : getGuideOperation();
					 break;
			case 4 : getProjectOperation();
					 break;
			case 5 : getPresentOperation();
					 break;
			case 6 : getReportOperation();
					 break;
			case 7 : getMarksOperation();
					 break;*/
			case 8 : System.out.println("Exited Successfully!!");
					 System.exit(0);
			default : System.out.println("Invalid choice...Program Exited!!");
					  break;
			}
			
		}
		
		public static void main(String[] args) {
		getOperation();

	}

}

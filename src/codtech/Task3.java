package codtech;
import java.util.*;


public class Task3 {
private static Scanner sc=new Scanner(System.in);
private static ArrayList<student> stud_List=new ArrayList<student>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome to Student Grade Management System");	       
		int choice;	        boolean running=true;
	        
	        while(running) {
	        	System.out.println("\n1: Add Student");
	            System.out.println("2: Update Student");
	            System.out.println("3: Delete Student ");
	            System.out.println("4: Display Student");
	            System.out.println("5: Exit");
	            System.out.print("Enter your choice: ");
	        	choice=sc.nextInt();
	        	
	        	switch(choice) {
	        	  case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    updateStudent();
	                    break;
	                case 3:
	                    deleteStudent();
	                    break;
//	                case 4:
//	                    displayStudent();
//	                    break;
	                case 5:
	                	running=false;
	                	System.out.println("Exiting.....");
	                	break;
	                	
	                	default:
	                		System.out.println("Invalid choice please try again");
	        	}
	        }
	        
	        }
	
	
	


	private static void addStudent() {
		System.out.print("\nEnter your name : ");
        String studName = sc.next();

        System.out.print("\nEnter your roll number : ");
        int roll_no = sc.nextInt();

        System.out.print("\nEnter the number of Subjects:");
        int numberOfSubjects = sc.nextInt();
        
       double totalMarks = 0;
        
        for(int i=0;i<numberOfSubjects;i++) {
        	System.out.print("\nEnter the marks obtained out of 100 in Subject " + (i + 1)+"\t" );
        	int marks=sc.nextInt();
        	totalMarks+=marks;
        	
            
        }
        
        // Calculate Average Percentage
        double Percentage = (double) totalMarks / (numberOfSubjects*100)*100;
        System.out.println("Percentage: " + Percentage + "%");
        String grade=calculateGrade(Percentage);
        System.out.println("Grade: " + grade);
        
      student stud=new  student(studName,roll_no,numberOfSubjects,totalMarks,Percentage,grade);
      stud_List.add(stud);
        
       
        
    }
	 public static String calculateGrade(double percentage) {
	        if (percentage >= 90) {
	            return "A";
	        } else if (percentage >= 80) {
	            return "B";
	        } else if (percentage >= 70) {
	            return "C";
	        } else if (percentage >= 60) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }

	
		
	 private static void updateStudent()
	 {
		 System.out.print("Enter  Existing roll number of student ");
	        int rollNumber = sc.nextInt();
	        boolean found = false;
	        for (student students : stud_List) {
	            if (student.getRoll_no() == rollNumber) {
	                System.out.print("Enter the number of subjects: ");
	                int numSubjects = sc.nextInt();
//	                ArrayList<Integer> updatedMarks = new ArrayList<>();
	                for (int i = 1; i <= numSubjects; i++) {
	                    System.out.print("Enter new marks for subject " + i + ": ");
	                    int marks=sc.nextInt();
                    student student = new student();    
						//	                   updatedMarks.add(marks);
	                    student.setMarks(marks);
	       }
	               System.out.println("Student details are updated successfully!!");
		found=true;
		break;
	            }
	        }
	        if (!found) {
	            System.out.println("Student with roll number " + rollNumber + " not found.");
	        }
		 
		 
	 }
	
	 private static void deleteStudent() {
			// TODO Auto-generated method stub
		 System.out.print("Enter roll number of student to delete: ");
	        int rollNumber = sc.nextInt();
	        boolean found = false;
	        for (student student : stud_List) {
	            if (student.getRoll_no() == rollNumber) {
	                stud_List.remove(student);
	                System.out.println("Student with roll number " + rollNumber + " deleted successfully.");
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Student with roll number " + rollNumber + " not found.");
	        }
		}

	 public static void viewAllStudents() {
	        if (stud_List.isEmpty()) {
	            System.out.println("No students found.");
	        } else {
	            System.out.println("Student Details:");
	            for (student student : stud_List) {
	                System.out.println(student);
	            }
	        }
	    }
	
}

	



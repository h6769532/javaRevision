package Arraylist;
import java.util.ArrayList;
import Arraylist.Student;

public class StudentList {
    private ArrayList<Student> list; // instance variable

    /**
     *  Constructor
     */
    public StudentList() { list = new ArrayList<Student>(); }
	
    /**
     *  A method to print off all ArrayList elements.
     */
    public void printList() {
        System.out.println("--Begin--");
        for(Student stu:list){
        	System.out.println(stu.toString());
        }
        System.out.println("--End--");
    }
	
    /**
     *  A method to add a student to the list.
     *  @param  The student.
     */
    public void addToList(Student stu) {
        list.add(stu);
        System.out.println(stu.getFirstName()+" "+stu.getLastName()+" has been added.");
    }

    /**
     *  A method to remove a student from the list.
     *  @param  The student.
     */
    public void removeFromList(Student stu) {
        list.remove(stu);
        System.out.println(stu.getFirstName()+" "+stu.getLastName()+" has been removed.");
    }
	
    /**
     *  A main() method to test.
     */
    public static void main(String[] args) {
        // Create an instance of the class.
	StudentList studentList = new StudentList();

	// Create 3 student objects.
	Student stu1 = new Student("John", "Smith", "js@qmul.ac.uk", 2009);
	Student stu2 = new Student("Mary", "Davis", "md@qmul.ac.uk", 2010);
		
	// Add the 3 students to the list.
	studentList.addToList(stu1);
	studentList.addToList(stu2);

	// Print the list.
	studentList.printList();
			
	// Remove the student "Mary Davis"
	studentList.removeFromList(stu2);
		
	// Print the list again
	studentList.printList();
    }
}
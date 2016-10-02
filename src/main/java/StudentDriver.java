import org.joda.time.DateTime;

public class StudentDriver {
	
	public static void main(String args[]){
		
		Course c1 = new Course("ECE", new DateTime(2016,1,1,0,0), new DateTime(2016,5,5,0,0) );
		Module m1 = new Module("Machine Learning", "CT111" );
		Module m2 = new Module("Software Engineering", "CT222");
		Student s1 = new Student("J. Murphy", 1990, 1234123, c1);
		Student s2 = new Student("P. Malanophy", 1992, 1334123, c1);
		Student s3 = new Student("A. Lynch", 1994, 1334222, c1);
		Student s4 = new Student("B. Ffrench", 1994, 1336222, c1);
		
		m1.addStudent(s1);
		m1.addStudent(s2);
		m1.addStudent(s3);
		m2.addStudent(s1);
		m2.addStudent(s3);
		m2.addStudent(s4);
		
		c1.addModule(m1);
		c1.addModule(m2);
		
		printStudents(c1);
		
	}
	
	private static void printStudents(Course c){
		for (int i=0; i<c.students.size(); i++){
			System.out.println();
			System.out.println("Student:  " + c.students.get(i).name);
			System.out.println("Course: " + c.students.get(i).course.name);
			
			for(int j=0; j<c.students.get(i).modules.size(); j++){
				System.out.println("Module "+ (j+1) + ": " + c.students.get(i).modules.get(j).name+", ");
			}
		}
	}

}

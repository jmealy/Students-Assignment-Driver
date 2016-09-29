import org.joda.time.DateTime;

public class StudentTest {
	
	public static void main(String args[]){
		
		Course c1 = new Course("ECE", new DateTime(2016,1,1,0,0), new DateTime(2016,5,5,0,0) );
		Module m1 = new Module("Machine Learning", "CT111" );
		Module m2 = new Module("Software Engineering", "CT222");
		Student s1 = new Student("J. Murphy", 1990, 1234123);
		Student s2 = new Student("P. Malanophy", 1992, 1334123);
		
		
	}

}

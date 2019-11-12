package Day033_Classes_Objects_constructures;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student("guzal", 28, "camerino university", "biology", 'f', 2013);
		Student s2=new Student("kelly", 25, "camerino university", "math", 'f', 2013);

		s1.attendLab();
		s2.attendlecture();
	}

}

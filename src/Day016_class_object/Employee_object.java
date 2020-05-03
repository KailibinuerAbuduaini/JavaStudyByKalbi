package Day016_class_object;

public class Employee_object {

	public static void main(String[] args) {
	
       Employee employee1=new Employee();
       Employee employee2=new Employee();
       Employee employee3=new Employee();
       
       employee1.salary=3000;
       employee2.name="kelly";
       employee3.jobTitle="operator";
       System.out.println(employee1.salary);
       
       employee1.work();
       employee2.attendMeeting();
       employee3.introduce();
	}

}

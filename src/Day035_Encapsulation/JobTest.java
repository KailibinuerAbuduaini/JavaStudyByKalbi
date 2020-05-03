package Day035_Encapsulation;

import java.util.ArrayList;

public class JobTest {

	public static void main(String[] args) {
	Job job1=new Job();
	Job job2=new Job("Java developer");
	Job job3=new Job("SDET", "Amazon", 130000);
	System.out.println(job1.toString());
	System.out.println(job2.toString());
	System.out.println(job3.toString());
	//create a list
	//add 5 different jobs with company salary title;
	ArrayList<Job> jobList=new ArrayList<>();
	jobList.add(job3);
	jobList.add(new Job("we","ab",90000));
	
	jobList.add(new Job("e","a",190000));
	jobList.add(new Job("wwrf","abdfwe",94000));
	jobList.add(new Job("wdsfew","agregb",2345000));
	jobList.add(new Job("wvfgtre","qewqeerrb",8907000));
	
	System.out.println(jobList.toString());
	// find the highest paying job and print it
	double MaxSalary=0;
	int highestIndex=0;
	for(int i=0;i<jobList.size();i++) {
		if(jobList.get(i).getAnnualSalary()>MaxSalary){
			MaxSalary=jobList.get(i).getAnnualSalary();
			highestIndex=i; //which index has the highest salary

		}
	}
	System.out.println(jobList.get(highestIndex).getAnnualSalary());
	
	}

}

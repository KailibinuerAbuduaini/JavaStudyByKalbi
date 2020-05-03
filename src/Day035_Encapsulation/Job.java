package Day035_Encapsulation;

public class Job {
	private String title;
	private String company;
	
	private double annualSalary;
	public Job() {
		System.out.println("No-arguments constructor");
		this.title="undefined";
		this.company="undefined";
		
	}
	public Job(String title) {
		System.out.println("one-arguments constructor");
		this.title=title;
		this.company="undefined";
	}
	public Job(String title, String company, double annualSalary) {
		System.out.println("Three-arguments constructor");
		setTitle(title);
		setCompany(company);
		this.annualSalary = annualSalary;
		
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	

}

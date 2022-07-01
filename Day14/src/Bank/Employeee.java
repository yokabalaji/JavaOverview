package Bank;

public abstract class Employeee {
	String name;
	int id;
	int salaryPerHour;
	int workingHour;
	String job;
	abstract public String getWork(String job);
	abstract public String calculateSalaryPerDay(int salaryPerHour,int workingHour);
	
	
	
	

}

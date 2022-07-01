package Bank;

public class Programmer extends Employeee {
	 public String getWork(String job) {
		return job;
	}
public String calculateSalaryPerDay(int salaryPerHour,int workingHour) {
	return "totalsalary="+(salaryPerHour*workingHour);
}

}

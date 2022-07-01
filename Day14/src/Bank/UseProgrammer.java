package Bank;

public class UseProgrammer {
public static void main(String[] args) {
	Programmer p=new Programmer();
	p.name="bala";
	p.id=443;
	p.salaryPerHour=100;
	p.workingHour=8;
	p.job="teaching";
	System.out.println("Name="+p.name+" "+"id="+p.id+" "+"Work="+p.getWork(p.job)+" "+"salary per day="+p.calculateSalaryPerDay(p.salaryPerHour,p.workingHour));
}
}

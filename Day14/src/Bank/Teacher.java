package Bank;

public class Teacher implements Employee{
	public String showSalary(int salary) {
		return "Salary="+salary;
	}
	public String showWork(String work) {
		return "Work="+work;
	}
	public String showWorkingSector(String sector) {
		return "Sector="+sector;
	}

}

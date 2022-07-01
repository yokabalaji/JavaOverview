package Oops2;

public class Employee extends Person{
private int salary;
public void work() {
	System.out.println("is working");
}
public Employee(String name, int age, int salary) {
	super(name, age);
	this.salary = salary;
}
@Override
public String toString() {
	return super.toString()+" "+salary;
}

	
}

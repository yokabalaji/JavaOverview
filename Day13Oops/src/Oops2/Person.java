package Oops2;

public class Person {
	private String name;
	private int age;
	public void eat()  {
		System.out.println("is eating");
	}
	public void sleep() {
		System.out.println("is sleeping");
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+" "+age;
	}

}

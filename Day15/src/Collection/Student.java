package Collection;

public class Student {
	private String name;
	private int age;
	private String gender;
	private char section;
	private int mark;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Student(String name, int age, String gender, char section, int mark) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.section = section;
		this.mark = mark;
	}
	public String toString() {
		return "Student name=" + name + ", age=" + age + ", gender=" + gender + ", section=" + section + ", mark="
				+ mark;
	}
	
	

}

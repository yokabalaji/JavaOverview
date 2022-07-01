package Bank;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		System.out.println(t.showSalary(2500)+","+t.showWork("Security")+","+t.showWorkingSector("private"));
	}

}

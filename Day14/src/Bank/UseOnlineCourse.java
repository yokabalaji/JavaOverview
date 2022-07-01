package Bank;

public class UseOnlineCourse {
	public static void main(String[] args) {
		OnlineCourse oc=new OnlineCourse();
		oc.name="java";
		System.out.println(oc.showCourseId(001)+","+oc.showCourseName(oc.name)+","+oc.showTrainer("Balaji")+","+oc.showCourseFee(oc.name));
	}

}

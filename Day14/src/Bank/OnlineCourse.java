package Bank;

public class OnlineCourse implements Course {
	String name;
	public int showCourseId(int id) {
		return id;
	}
	public String showCourseName(String name) {
		return name;
	}
	public String showTrainer(String trainerName) {
		return trainerName;
	}
	public String showCourseFee(String name) {
	if(name.equalsIgnoreCase("JAva")) {
		return "course fee="+35000;
	}
	else if(name.equalsIgnoreCase("ethical hacking")) {
		return "course fee="+50000;
	}
	else if(name.equalsIgnoreCase("python")) {
		return "course fee="+39000;
	}
	else if(name.equalsIgnoreCase("Sql")) {
		return "Course fee="+4000;
	}else {
		return "Invalid data";
	}
	}
	

}

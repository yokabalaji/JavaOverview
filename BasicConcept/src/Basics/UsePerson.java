package Basics;

public class UsePerson {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="kamal";
		p1.age=26;
		p1.phoneNo=8695689293l;
		p1.height=6.6f;
		p1.initial='c';
		p1.isMarried=true;
		System.out.println("name : "+p1.name+'\n'+"age: "+p1.age+'\n'+"phone no: "+p1.phoneNo+'\n'+"height:"+p1.height+'\n'+"initial:"+p1.initial+'\n'+"married:"+p1.isMarried);
	}

}

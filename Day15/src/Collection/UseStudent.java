package Collection;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("balaji",23,"male",'a',300);
		Student s2=new Student("yoga",24,"male",'a',200);
		Student s3=new Student("priya",21,"female",'a',250);
		Student s4=new Student("sagunthala",34,"female",'a',500);
		Student s5=new Student("tharani",27,"female",'a',489);
		Student s6=new Student("ranjani",25,"female",'a',483);
		Student s7=new Student("pugal",22,"male",'b',479);
		Student s8=new Student("naveen",27,"male",'b',469);
		Student s9=new Student("santhosh",26,"male",'b',234);
		Student s10=new Student("sathish",22,"male",'a',312);
		ArrayList<Student>li=new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);
		li.add(s7);
		li.add(s8);
		li.add(s9);
		li.add(s10);
	/*	for(int i=0;i<li.size();i++) {
		//	System.out.println(li.get(i));
		 }*/
//	li.forEach((x)->{if(x.getAge()%2!=0){System.out.println(x);}});
	//	for(Student xy:li) {
		//	if(xy.getMark()>350) {
		//		System.out.println(xy);
		//	}
	//	}
	//	ArrayList<Student>lii=new ArrayList<>();
	//	for(int i=0;i<li.size();i++) {
		//	if(li.get(i).getGender().equalsIgnoreCase("female")) {
			//	lii.add(li.get(i));
		//	}
		//	System.out.println(lii);
	//	}
		ArrayList<Student>maleli=new ArrayList<>();
		for(Student xz:li) {
			if(xz.getGender().equalsIgnoreCase("male")) {
				maleli.add(xz);
			}
			System.out.println(maleli);
		}
		

		
	}

}

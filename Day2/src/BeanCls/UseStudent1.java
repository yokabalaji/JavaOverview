package BeanCls;

public class UseStudent1 {
	public static void main(String[]args) {
		Student1 a=new Student1();
		Student1 a1=new Student1();
		Student1 a2=new Student1();
		a.name="siva";
		a1.name="mani";
		a2.name="valli";
		a.id=234;
		a1.id=236;
		a2.id=237;
		a.age=14;
		a1.age=15;
		a2.age=13;
		a.stuclass="IX";
		a1.stuclass="X";
		a2.stuclass="VIII";
		a.attendancePercentage=75;
		a1.attendancePercentage=80;
		a2.attendancePercentage=90;
		a.numOfDays=240*a.attendancePercentage/100;
		a1.numOfDays=240*a1.attendancePercentage/100;
		a2.numOfDays=240*a2.attendancePercentage/100;
		System.out.println(" name: "+a.name+" id: "+a.id+" age: "+a.age+" class: "+a.stuclass
		+" attendancePercentage"+a.attendancePercentage+" work days: "
		+a.numOfDays+'\n'+" name: "+a1.name+" id: "+a1.id+" age: "+a1.age+" class: "+a1.stuclass
		+" attendancePercentage"+a1.attendancePercentage+" work days: "
		+a1.numOfDays+'\n'+" name: "+a2.name+" id: "+a2.id+" age: "+a2.age
		+" class: "+a2.stuclass+" attendancePercentage"+a2.attendancePercentage+" work days: "
		+a2.numOfDays);
		
		
		
	}

}

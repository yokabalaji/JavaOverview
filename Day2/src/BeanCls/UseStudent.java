package BeanCls;

public class UseStudent {
	public static void main(String[] args) {
		Student a=new Student();
		a.studentName="yoga";
		a.studentAge=20;
		a.marksPercentage=90;
		a.studentMobileNo=687687678668l;
		a.classSec='c';
		System.out.println("name: "+a.studentName+"age: "+a.studentAge+"markper: "+a.marksPercentage+"mob no: "+a.studentMobileNo+"sec: "+a.classSec);
		Student a1=new Student();
		a1.studentName="yoga";
		a1.studentAge=21;
		a1.marksPercentage=90;
		a1.studentMobileNo=65655678668l;
		a1.classSec='a';
		System.out.println("name: "+a1.studentName+"age: "+a1.studentAge+"markper: "+a1.marksPercentage+"mob no: "+a1.studentMobileNo+"sec: "+a1.classSec);
		Student a2=new Student();
		a2.studentName="yoga";
		a2.studentAge=24;
		a2.marksPercentage=70;
		a2.studentMobileNo=686458668l;
		a2.classSec='b';
		System.out.println("name: "+a2.studentName+"age: "+a2.studentAge+"markper: "+a2.marksPercentage+"mob no: "+a2.studentMobileNo+"sec: "+a2.classSec);
	}

}

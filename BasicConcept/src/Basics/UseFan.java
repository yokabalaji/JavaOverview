package Basics;

public class UseFan {
	public static void main(String[] args) {
		Fan a=new Fan();
		a.company="Crompton";
		a.rate=1000;
		a.color="white";
		a.rotatePerSec=160.25f;
		a.cusMobNo=8695689293l;
		a.fanRotatateOrNot=true;
		System.out.println("company name: "+a.company+" fan rate:"+a.rate+" fan color:"+a.color+" fan rotate per sec:"+a.rotatePerSec+" cus mobile Num:"+a.cusMobNo+" fan rotate or not:"+a.fanRotatateOrNot);
		
	}

}

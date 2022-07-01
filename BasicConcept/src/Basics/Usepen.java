package Basics;

public class Usepen {
	public static void main(String[]args) {
		Pen p1=new Pen();
		p1.price=400;
		p1.discount=20;
		p1.netPrice=p1.price-(p1.price*p1.discount/100);
		System.out.println(p1.netPrice);
	}

}

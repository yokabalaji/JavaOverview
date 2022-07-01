package day5ObjectIfSwitch;

public class UseBooky {
	public static void main(String[] args) {
		
	Book b1=new Book();
	Book b2=new Book();
	Book b3=new Book();
	b1.name="Yoga";
	b1.noOfPages=1200;
	b1.price=2300.0f;
	b1.isfiction=true;
	b2.name="balaji";
	b2.noOfPages=500;
	b2.price=2400.60f;
	b2.isfiction=false;
	b3.name="priya";
	b3.noOfPages=5000;
	b3.price=5000.60f;
	b3.isfiction=false;
	b3.disper=10;
	
	if(b1.price<b2.price && b2.price<b3.price) {
		b3.discount=b3.price-(b3.price*b3.disper/100);
		System.out.println(b3.name+" "+b3.noOfPages+" "+b3.price+" "+b3.isfiction+" "+b3.discount);
	}
	else if (b1.price<b3.price && b3.price<b2.price)
	{
		b2.discount=b2.price-(b2.price*b2.disper/100);
		System.out.println(b2.name+" "+b2.noOfPages+" "+b2.price+" "+b2.isfiction+" "+b2.discount);
		
	}
	else{
		b1.discount=b1.price-(b1.price*b1.disper/100);
		System.out.println(b1.name+" "+b1.noOfPages+" "+b1.price+" "+b1.isfiction+" "+b1.discount);
	}
	
	
}

}


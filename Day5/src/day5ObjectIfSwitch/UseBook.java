package day5ObjectIfSwitch;

public class UseBook {
	public static void main(String []args) {
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		b1.name="Yoga";
		b1.noOfPages=1200;
		b1.price=2000.0f;
		b1.isfiction=true;
		b2.name="balaji";
		b2.noOfPages=500;
		b2.price=2000.60f;
		b2.isfiction=false;
		b3.name="priya";
		b3.noOfPages=5000;
		b3.price=2000.60f;
		b3.isfiction=false;
		if(b1.noOfPages>b2.noOfPages && b2.noOfPages<b3.noOfPages) {
			System.out.println(b3.name+" "+b3.noOfPages+" "+b3.price+" "+b3.isfiction);
		}else {
			
			System.out.println(b2.name+" "+b2.noOfPages+" "+b2.price+" "+b2.isfiction);
		}
		
		
	}

}

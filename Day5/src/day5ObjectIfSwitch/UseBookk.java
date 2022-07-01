package day5ObjectIfSwitch;

public class UseBookk {
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
			if((b1.isfiction==true) &&(b2.isfiction==true)) {
				System.out.println("ALL BOOKS ARE FICTION");
			}else {
				
				System.out.println("ALL BOOKS ARE NOT FICTION");
			}
			
			
		}

	}



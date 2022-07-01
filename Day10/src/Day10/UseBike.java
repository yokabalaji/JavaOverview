package Day10;

public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.brand="yamaha";
		b1.price=2000;
		b1.ispetrol=true;
		Bike b2=new Bike();
		b2.brand="duke";
		b2.price=30000;
		b2.ispetrol=false;
		Bike b3=new Bike();
		b3.brand="bmw";
		b3.price=12000000;
		b3.ispetrol=true;
		Bike b4=new Bike();
		b4.brand="suzuki";
		b4.price=200000;
		b4.ispetrol=false;
		Bike b5=new Bike();
		b5.brand="r15";
		b5.price=700000;
		b5.ispetrol=false;
		Bike b6=new Bike();
		b6.brand="rx100";
		b6.price=200000;
		b6.ispetrol=false;
		Bike b7=new Bike();
		b7.brand="honda";
		b7.price=50000;
		b7.ispetrol=true;
		Bike b8=new Bike();
		b8.brand="hero";
		b8.price=80000;
		b8.ispetrol=true;
		Bike[] c= {b1,b2,b3,b4,b5,b6,b7,b8};
		//int min=c[0].price;
		int max=0;
		//String te=c[0].brand;
		String temp="";
		for(int i=0;i<c.length;i++) {
			if(c[i].price>max) {
				max=c[i].price;
				temp=c[i].brand; 
				
			}}
			/*if(c[i].price<min) {
				min=c[i].price;
				te=c[i].brand;
			}} */
			System.out.println(temp);
	}}



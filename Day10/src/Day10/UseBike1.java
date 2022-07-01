package Day10;

public class UseBike1 {
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
		b3.price=120000;
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
		Bike []c= {b1,b2,b3,b4,b6,b7,b8};
		String temp="";
		int min=0;
		for(int i=0;i<c.length;i++) {
			// minimum
		/*	if(c[i].price>c[0].price) {
			min=c[i].price;
				temp=c[i].brand;
				
			}} */
			// 1 laks above
			if(c[i].price>100000) {
				temp=c[i].brand;
			}
			System.out.println(temp);
	}
	}
}


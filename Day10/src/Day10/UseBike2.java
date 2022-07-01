package Day10;

public class UseBike2 {
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.brand="yamaha";
		b1.price=200000;
		b1.ispetrol=true;
		Bike b2=new Bike();
		b2.brand="duke";
		b2.price=3000000;
		b2.ispetrol=false;
		Bike b3=new Bike();
		b3.brand="bmw";
		b3.price=120000;
		b3.ispetrol=true;
		Bike b[]= {b1,b2,b3};
		for(int i=0;i<b.length;i++) {
			if(b[i].price<300000) {
				System.out.println("tax free");
			}else {
				System.out.println(b[i].price+5000);
			}
				
			}
		}

}

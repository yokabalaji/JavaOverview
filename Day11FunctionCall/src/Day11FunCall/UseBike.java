package Day11FunCall;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.brand="honda";
		bike1.price=120000;
		bike1.model="ninja";
		bike1.taxper=25;
		Bike bike2=new Bike();
		bike2.brand="r15";
		bike2.price=1200000;
		bike2.model="x5";
		bike2.taxper=40;
		bike1.sysout();
		bike2.sysout();
	/*	int netprice=bike1.netprice();
		System.out.println(netprice);*/
		System.out.println("BIKE1="+bike1.netprice());
		int netprice1=bike2.netprice();
		System.out.println("Bike2="+netprice1);
	}

}

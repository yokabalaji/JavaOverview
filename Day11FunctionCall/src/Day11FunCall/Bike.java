package Day11FunCall;

public class Bike {
	String brand;
	int price;
	String model;
	int taxper;
	public int netprice() {
		int num=price+(price*taxper/100);
		return num;
	}
	public void sysout() {
		System.out.println(brand.toUpperCase()+","+price+","+model.toUpperCase());
		
	}

}

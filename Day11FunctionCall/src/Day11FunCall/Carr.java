package Day11FunCall;

public class Carr {
	String brand;
	int price;
	String model;
	String color;
	int taxper;
	int netprice;
	int regno;
	public int netprice() {
		int num=price+(price*taxper/100);
		return num;
	}
	public int netpriceavg(int netprice1) {
		int tot=netprice+netprice1;
		int avg=tot/2;
		return avg;
	}
	public void regnoLuckNum() {
		int []a= {regno};
		int c=[0];
		for(int i=0;i<=a.length;i++) {
			c+=a[i];
		}
		System.out.println(c.length-1);
	}
		public void redcolor()	{
			if(color.equalsIgnoreCase("red")) {
				System.out.println(brand+", "+price+", "+model);
			
			
		}
		public String prime(int regno) {
					int b=0;
					for(int i=2;i<regno;i++) {
						if(regno%2==0) {
							b=1;
						}
					}
					if(b==0) {
						return regno+"is prime";
					}else {
						return regno+"is not prime";
					}
				
			}
		

}
}

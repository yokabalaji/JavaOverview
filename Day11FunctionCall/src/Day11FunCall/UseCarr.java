package Day11FunCall;

public class UseCarr {
	public static void main(String[] args) {
		Carr c=new Carr();
		c.price=2000;
		c.brand="jackuva";
		c.taxper=20;
		Carr c1=new Carr();
		c1.price=3000;
		c1.taxper=15;
		System.out.println(c.netprice()+", "+c1.netprice());
		System.out.println(c.netpriceavg(c1.netprice));
	}

}

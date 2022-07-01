package Day11FunCall;

public class UseLorry {
	public static void main(String[] args) {
		Lorry lor1=new Lorry();
	lor1.brand="honda";
		lor1.price=120000;
		lor1.model="ninja";
		lor1.taxper=25;
		Lorry lor2=new Lorry();
		lor2.brand="honda";
			lor2.price=40000;
			lor2.model="ninja";
			lor2.taxper=25;
		
		System.out.println("lorry1="+lor1.netprice());
		System.out.println("lorry2="+lor2.netprice());

}}

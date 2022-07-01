package BeanCls;

public class UseAirConditioner {
	public static void main(String[] args) {
		AirConditioner a=new AirConditioner();
		a.brand="usha";
		a.price=1000;
		a.isQuality="good";
		AirConditioner a1=new AirConditioner();
		a1.brand="sony";
		a1.price=1500;
		a1.isQuality="good";
		System.out.println("brand: "+a.brand+" price:"+a.price+" Quality "+a.isQuality);
		System.out.println("brand: "+a1.brand+" price:"+a1.price+" Quality "+a1.isQuality);
		
		
		
	}

}

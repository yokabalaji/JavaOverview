package BeanCls;

public class UseMarker {
	public static void main(String[] args) {
		Marker a=new Marker();
		a.price=120;
		a.color="red";
		a.weight=1.3f;
		a.isQuality="good";
		System.out.println("pen price:"+a.price+"color: "+a.color+"weight: "+a.weight+" isQuality:"+a.isQuality);
		Marker a1=new Marker();
		a1.price=130;
		a1.color="blue";
		a1.weight=1.5f;
		a1.isQuality="good";
		System.out.println("pen price:"+a1.price+"color: "+a1.color+"weight: "+a1.weight+" isQuality:"+a1.isQuality);
		Marker a2=new Marker();
		a2.price=130;
		a2.color="white";
		a2.weight=1.6f;
		a2.isQuality="good";
		System.out.println("pen price:"+a2.price+"color: "+a2.color+"weight: "+a2.weight+" isQuality:"+a2.isQuality);
		
	}

}

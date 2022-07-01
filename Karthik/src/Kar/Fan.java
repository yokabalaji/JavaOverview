public class useFan {
	public static void main(String[] args) {
		String a=args[0];
		int b=Integer.parseInt(args[1]);
		String c=args[2];
		String d=args[3];
		Fan fan=new Fan(a,b,c,d);
		System.out.println(fan);
	}
}
}
}
class Fan {
	private String brand;
	private int price;
	private String color;
	private String material;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public Fan(String brand,int price,String color,String material) {
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.material=material;
	}
	public String toString() {
		return"Brand:"+brand+"Price"+price+"color"+color;
	}
	

}

package lmswork;

public class Usebike {
	public static void main(String[]args) {
		String a=args[0];
		String b[]=a.split(",");
		bike c=new bike();
		c.model=b[0];
		c.price=Integer.parseInt(b[1]);
		c.color=b[2];
		System.out.println(c.model.toUpperCase()+"#"+c.price+"#"+c.color.toUpperCase());
	
		
	}

}
class bike{
String model;
String color;
int price;
}

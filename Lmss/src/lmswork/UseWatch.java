package lmswork;

public class UseWatch {
	public static void main(String[]args) {
		String a=args[0];
		String b=args[1];
		String []c=a.split(",");
		String []d=b.split(",");
		Watch w1=new Watch();
		Watch w2=new Watch();
		w1.brand=c[0];
		w2.brand=d[0];
		String e=w1.brand.concat(w2.brand);
		String f=e.toUpperCase();
		w1.price=Integer.parseInt(c[3]);
		w2.price=Integer.parseInt(d[3]);
		w2.tot=w1.price+w2.price;
		System.out.println(f+" "+w2.tot);
		}
}
class Watch{
	String brand;
	String strapcolor;
	boolean iswarrantyAvailable;
	int price;
	int tot;
}

package Basics;

public class UseDoor {
	public static void main(String[] args) {
		Door a=new Door();
		Door a1=new Door();
		Door a2=new Door();
		a.color="brown";
		a.price=2000.50f;
		a.doorkey=1234;
		a.cusMobNo=869569293l;
		a.doorOpenOrClose=true;
		a1.color="white";
		a1.price=1500.50f;
		a1.doorkey=1238;
		a1.cusMobNo=869569293l;
		a1.doorOpenOrClose=true;
		a2.color="white";
		a2.price=1500.50f;
		a2.doorkey=1238;
		a2.cusMobNo=869569293l;
		a2.doorOpenOrClose=true;
		a2.tot=a.price+a1.price+a2.price;
		a2.disper=50;
		a2.tax=15;
		a2.netprice=a2.tot-(a2.tot*a2.disper/100);
		a2.taxAmt=a2.tot+(a2.tot*a2.tax/100);
		a2.avg=a2.tot/3;
		System.out.println(" door color:"+a.color+" door price:"+a.price+" door key:"+a.doorkey+" customer mob no:"+a.cusMobNo+" door close or not:"+a.doorOpenOrClose);
		System.out.println(" door color:"+a1.color+" door price:"+a1.price+" door key:"+a1.doorkey+" customer mob no:"+a1.cusMobNo+" door close or not:"+a1.doorOpenOrClose);
		System.err.println(" door color:"+a2.color+" door price:"+a2.price+" door key:"+a2.doorkey+" customer mob no:"+a2.cusMobNo+" door close or not:"+a2.doorOpenOrClose+" total amt:"+a2.tot+" avg:"+a2.avg+"net price:"+a2.netprice+"tax price:"+a2.taxAmt);
	}
}

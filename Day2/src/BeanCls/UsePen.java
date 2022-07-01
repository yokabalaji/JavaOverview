package BeanCls;

public class UsePen {
	public static void main(String[]args) {
		Pen a=new Pen();
		a.brand="pargar";
		a.price=200;
		a.color="blue";
		a.width=1.1f;
		Pen a1=new Pen();
		a1.brand="pargar";
		a1.price=300;
		a1.color="blue";
		a1.width=1.2f;
		Pen a2=new Pen();
		a2.brand="pargar";
		a2.price=400;
		a2.color="blue";
		a2.width=1.5f;
		a2.avg=(a.price+a1.price+a2.price)/3;
		System.out.println("Brand:"+a.brand+"Price:"+a.price+"color:"+a.color+"width:"+a.width+'\n'+"Brand:"+a1.brand+"Price:"+a1.price+"color:"+a1.color+"width:"+a1.width+'\n'+"Brand:"+a2.brand+"Price:"+a2.price+"color:"+a2.color+"width:"+a2.width+"avg: "+a2.avg);		
		}

}

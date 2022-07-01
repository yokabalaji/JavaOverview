package objectforloop;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="nano";
		c1.price=300000;
		c1.engine=1500;
		c1.color="blue";
		c1.dis=10;
		Car c2=new Car();
		c2.brand="sutuki";
		c2.price=400000;
		c2.engine=1000;
		c2.color="black";
		c2.dis=20;
		Car c3=new Car();
		c3.brand="maruthi";
		c3.price=500000;
		c3.engine=500;
		c3.color="white";
		c3.dis=10;
		Car c[]= {c1,c2,c3};
		int tot=0;
		int discount=0;
		for(int i=0;i<c.length;i++) {
		tot=tot+c[i].price;
		discount=c[i].price-(c[i].price*c[i].dis/100);
			System.out.println(c[i].brand+" "+c[i].price+" "+c[i].engine+" "+c[i].color+" "+discount);
		}
		System.out.println(tot);
		
	}
}


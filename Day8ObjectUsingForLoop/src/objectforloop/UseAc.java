package objectforloop;

public class UseAc {
	public static void main(String[] args) {
		Ac a1=new Ac();
		a1.brand="hitachi";
		a1.price=4000;
		a1.isCooling=true;
		a1.color="white";
		a1.disper=20;
		a1.dis=a1.price-(a1.price*a1.disper/100);
		Ac a2=new Ac();
		a2.brand="whirpool";
		a2.price=5000;
		a2.isCooling=true;
		a2.color="black";
		a2.disper=30;
		a2.dis=a2.price-(a2.price*a2.disper/100);
		Ac a3=new Ac();
		a3.brand="hp";
		a3.price=3000;
		a3.isCooling=true;
		a3.color="brown";
		a3.disper=50;
		a3.dis=a3.price-(a3.price*a2.disper/100);
		Ac [] c={a1,a2,a3};
		int tot=0;
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].brand+" "+c[i].price+" "+c[i].isCooling+" "+c[i].color+" "+c[i].dis);
			tot=tot+c[i].price;
		}
		System.out.println("TOTAL PRICE: "+tot);
		
	
	}

}

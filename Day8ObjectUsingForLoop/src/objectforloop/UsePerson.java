package objectforloop;

public class UsePerson {
	public static void main(String[] args) {
		String a[]=args[0].split(",");
		Person a1=new Person();
		a1.brand=a[0];
		a1.price=Integer.parseInt(a[1]);
		a1.engine=Integer.parseInt(a[2]);
		a1.color=a[3];
		String []b1=args[1].split(",");
		Person b=new Person();
		b.brand=b1[0];
		b.price=Integer.parseInt(b1[1]);
		b.engine=Integer.parseInt(b1[2]);
		b.color=b1[3];
		Person c[]= {a1,b};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].brand+" "+c[i].price+" "+c[i].engine+" "+c[i].color);
		}
		
		
	}

}

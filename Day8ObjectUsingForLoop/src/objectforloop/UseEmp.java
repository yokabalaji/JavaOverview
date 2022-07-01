package objectforloop;

public class UseEmp {
	public static void main(String[] args) {
		Emp a=new Emp();
		a.name="balaji";
		a.salary=40000;
		a.id=591;
		a.tax=8;
		Emp b=new Emp();
		b.name="yoga";
		b.salary=50000;
		b.id=592;
		b.tax=8;
		Emp []c= {a,b};
		int tot=0;
		int count=0;
		int taxx;
		for(int i=0;i<c.length;i++) {
			taxx=c[i].salary+(c[i].salary*c[i].tax/100);
			
			
			tot=tot+c[i].salary;
			count++;
			System.out.println(c[i].name+" "+c[i].salary+" "+c[i].id+" "+taxx);
		}
		System.out.println("avereage: "+tot/count);
		
	}

}

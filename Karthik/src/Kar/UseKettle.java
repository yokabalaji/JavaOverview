package Kar;
public class UseKettle {
	public static void main (String[] args) {
		Kettle kettle1=new Kettle();
		String []a=args[0].split("#");
		kettle1.brand=a[0];
		kettle1.price=Integer.parseInt (a[1]);
		kettle1.color=a[2];
		kettle1.taxAmount=Integer.parseInt (a[3]);
		 kettle1.netPrice=kettle1.price+kettle1.taxAmount;
		Kettle kettle2=new Kettle();
		String []b=args[1].split("#");
		kettle2.brand=b[0];
		kettle2.price=Integer.parseInt (b[1]);
		kettle2.color=b[2];
		kettle2.taxAmount=Integer.parseInt (b[3]);
		 kettle2.netPrice=kettle2.price+kettle2.taxAmount;
		Kettle kettle3=new Kettle();
		String []c=args[2].split("#");
		kettle3.brand=c[0];
		kettle3.price=Integer.parseInt (c[1]);
		kettle3.color=c[2];
		kettle3.taxAmount=Integer.parseInt (c[3]);
		 kettle3.netPrice=kettle3.price+kettle3.taxAmount;
		Kettle []k= {kettle1,kettle2,kettle3};
		int max=0;
		String z="";
		String z1="";
		int pri=0;
		int i;
		for( i=0; i<k.length; i++) {
		//	 netPrice=k[i].price+k[i].taxAmount;
			if (k[i].netPrice>max) {
				max=k[i].netPrice;
			z=k[i].brand; //+k[i].price+k[i].color+k[i].netPrice;
			z1=k[i].color;
			//pri=k[i].price;
			
			}
			
			
			
	//	System.out.println("BRAND= "+k[i].brand.toUpperCase()+"COLOR= "+k[i].color.toUpperCase()+"NETPRICE= "+netPrice);

			}
		System.out.println("BRAND= "+z.toUpperCase()+"COLOR= "+z1.toUpperCase()+"NETPRICE= "+max);
		//System.out.println(z);
	//System.out.println("BRAND= "+z.toUpperCase()+"COLOR= "+k[i].color.toUpperCase()+"NETPRICE= "+netPrice);
			//System.out.println(z);
		}

}

package Kar;
public class UseKeyboard {
	public static void main (String[] args) {
		Keyboard keyboard1=new Keyboard();
		String []a=args[0].split("@");
		keyboard1.brand=a[0];
		keyboard1.price=Integer.parseInt (a[1]);
		keyboard1.color=a[2];
		Keyboard keyboard2=new Keyboard();
		String []b=args[1].split("@");
		keyboard2.brand=b[0];
		keyboard2.price=Integer.parseInt (b[1]);
		keyboard2.color=b[2];
		Keyboard keyboard3=new Keyboard();
		String []c=args[2].split("@");
		keyboard3.brand=c[0];
		keyboard3.price=Integer.parseInt (c[1]);
		keyboard3.color=c[2];
		Keyboard []k= {keyboard1,keyboard2,keyboard3};
		for(int i=0; i<k.length; i++) {
			if(k[i].price>10000) {
				System.out.println("BRAND= "+k[i].brand.toUpperCase()+"COLOR= "+k[i].color.toUpperCase()+"PRICE= "+k[i].price);
			}
			else if (k[i].price<10000) {
				System.out.println("NO");
			}
		}
	}

		
	}


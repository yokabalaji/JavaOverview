package objectforloop;

public class Teleee {
	public static void main(String[] args) {
				Tv tv1=new Tv();
				tv1.brand="realme";
				tv1.price=12000;
				tv1.isworking=true;
				Tv tv2=new Tv();
				tv2.brand="oneplus";
				tv2.price=112999;
				tv2.isworking=true;
				Tv tv3=new Tv();
				tv3.brand="Bpl";
				tv3.price=1200000;
				tv3.isworking=true;
				Tv tv4=new Tv();
				tv4.brand="redmi";
				tv4.price=120425;
				tv4.isworking=true;
				Tv tv5=new Tv();
				tv5.brand="sony";
				tv5.price=30000;
				tv5.isworking=true;
				Tv tv6=new Tv();
				tv6.brand="nokia";
				tv6.price=12245;
				tv6.isworking=true;
				Tv tv7=new Tv();
				tv7.brand="samsung";
				tv7.price=69670;
				tv7.isworking=true;
				Tv tv8=new Tv();
				tv8.brand="hp";
				tv8.price=167000;
				tv8.isworking=true;
				Tv tv9=new Tv();
				tv9.brand="Onida";
				tv9.price=1200000;
				tv9.isworking=true;
				Tv tv10=new Tv();
				tv10.brand="excie";
				tv10.price=120090;
				tv10.isworking=true;
				Tv [] d= {tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10};
				int tot=0;
				String a=" ";
				for(int i=d.length/2;i<d.length;i++) {
					tot=tot+d[i].price;
					a=a.concat(d[i].brand);
					System.out.println(d[i].brand+" "+d[i].price);
				}
	System.out.println(a);
			}

		}

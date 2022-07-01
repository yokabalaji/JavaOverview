package Day10;

public class UseCar5 {
public static void main(String[] args) {
		
		Car c1=new Car();
		c1.brand="Audi";
		c1.price=200000;
		c1.regNo=4212;
		c1.carNo="TN22";
		Car c2=new Car();
		c2.brand="BMW";
		c2.price=200000;
		c2.regNo=1255;
		c2.carNo="KN33";
		Car c3=new Car();
		c3.brand="Innova";
		c3.price=300000;
		c3.regNo=5568;
		c3.carNo="AP32";
		Car c4=new Car();
		c4.brand="Ferrai";
		c4.price=600000;
		c4.regNo=6778;
		c4.carNo="UP78";
		Car c5=new Car();
		c5.brand="dukadi";
		c5.price=789700;
		c5.regNo=1235;
		c5.carNo="KL90";
		Car c6=new Car();
		c6.brand="suzuki";
		c6.price=70000;
		c6.regNo=8906;
		c6.carNo="PY88";
		Car c7=new Car();
		c7.brand="duster";
		c7.price=90000;
		c7.regNo=8945;
		c7.carNo="AS90";
		Car c8=new Car();
		c8.brand="kion";
		c8.price=79900;
		c8.regNo=2689;
		c8.carNo="GA96";
		Car []c= {c1,c2,c3,c4,c5,c6,c7,c8};
		 for(int i=0;i<c.length;i++) {
			 if(c[i].carNo.startsWith("TN")) {
				 System.out.println(c[i].brand);
			 }
			 if(c[i].carNo.startsWith("KN")){
				 System.out.println(c[i].brand);
			 }
			 if(c[i].carNo.startsWith("AP")) {
				 System.out.println(c[i].brand);
			 }
			 if(c[i].carNo.startsWith("UP")) {
				 System.out.println(c[i].brand);
			 }
			 if(c[i].carNo.startsWith("KL")) {
				 System.out.println(c[i].brand);
			 }
			 if(c[i].carNo.startsWith("PY")) {
				 System.out.println(c[i].brand);
			 }
			 if(c[i].carNo.startsWith("AS")) {
				 System.out.println(c[i].brand);
			 }
			 if(c[i].carNo.startsWith("GA")) {
				 System.out.println(c[i].brand);
			 }
		 }
		 
}
}

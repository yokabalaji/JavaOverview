package Day10;

public class UseCar6 {
public static void main(String[] args) {
		
		Car c1=new Car();
		c1.brand="Audi";
		c1.price=200000;
		c1.regNo=4212;
		c1.carNo="TN22";
		c1.color="red";
		Car c2=new Car();
		c2.brand="BMW";
		c2.price=200000;
		c2.regNo=1255;
		c2.carNo="KN33";
		c2.color="blue";
		Car c3=new Car();
		c3.brand="Innova";
		c3.price=300000;
		c3.regNo=5568;
		c3.carNo="AP32";
		c3.color="yellow";
		Car c4=new Car();
		c4.brand="Ferrai";
		c4.price=600000;
		c4.regNo=6778;
		c4.carNo="UP78";
		c4.color="red";
		Car c5=new Car();
		c5.brand="dukadi";
		c5.price=789700;
		c5.regNo=1235;
		c5.carNo="KL90";
		c5.color="black";
		Car c6=new Car();
		c6.brand="suzuki";
		c6.price=70000;
		c6.regNo=8906;
		c6.carNo="PY88";
		c6.color="green";
		Car c7=new Car();
		c7.brand="duster";
		c7.price=90000;
		c7.regNo=8945;
		c7.carNo="AS90";
		c7.color="orange";
		Car c8=new Car();
		c8.brand="kion";
		c8.price=79900;
		c8.regNo=2689;
		c8.carNo="GA96";
		c8.color="black";
		Car []c= {c1,c2,c3,c4,c5,c6,c7,c8};
		 for(int i=0;i<c.length;i++) {	
			 if(c[i].color.equalsIgnoreCase("black")) {
				 System.out.println(c[i].brand);
			 }
		
}
		 }
}

package Bank;

public class UseSportsBike {
	public static void main(String[] args) {
		 SportsBike s=new  SportsBike();
		 s.brake();
		 s.brand="bmw";
		 s.price=200000;
		 s.speed=400;
		 s.mileage=100;
		 s.cc=100;
		 System.out.println(s.showSpeed(s.speed)+","+s. getMilleage(s.mileage)+","+s.showEngine(s.cc));
	}

}

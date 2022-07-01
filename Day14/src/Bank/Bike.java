package Bank;

public abstract class Bike implements Vechical {
	int speed;
	int mileage;
	int cc;
	public String showSpeed(int speed) {
		return "Speed="+speed;
	}
	public String getMilleage(int milage) {
        return "Milege="+milage;		
	}
	public void brake() {
		System.out.println("braking on");
	}
	public abstract String showEngine(int cc);

}

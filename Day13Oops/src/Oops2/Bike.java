package Oops2;

public class Bike extends Cycle {
	int engineCc;

	public Bike(String brand, int price, int engineCc) {
		super(brand, price);
		this.engineCc = engineCc;

	}

	public String toString() {
		return super.toString() + "," + engineCc;
	}

}

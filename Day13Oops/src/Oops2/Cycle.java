package Oops2;

public class Cycle {
	String brand;
	int price;

	public String breaking() {
		return "is breaking work";
	}

	public int speed(int speed) {
		return speed;
	}

	public Cycle(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String toString() {
		return "Brand: " + brand + "," + "Price: " + price;
	}

}

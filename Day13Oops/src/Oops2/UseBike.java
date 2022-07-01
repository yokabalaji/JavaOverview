package Oops2;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1 = new Bike("tvs", 7200, 120);
		System.out.println(bike1 + " " + bike1.breaking() + " " + bike1.speed(120));
	}

}

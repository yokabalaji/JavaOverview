package org.Day1;

public class UseBike {
	public static void main(String[]args) {
		String a[]=args[0].split(",");
		Bike bike=new Bike();
		bike.brand=a[0];
	    bike.model=a[1];
		bike.price=Integer.parseInt(a[2]);
		bike.taxAmount=Integer.parseInt(a[3]);
		bike.netPrice=bike.price+bike.taxAmount;
		System.out.println(bike.brand+","+bike.netPrice);
		
	}

}

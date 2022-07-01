package Day11FunCall;

public class Lorry {
	String brand;
	int price;
	String model;
	int taxper;
	public int netprice() {
		int num=price+(price*taxper/100);
		return num;
	}

		

	}

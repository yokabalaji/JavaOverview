package Day11FunCall;

public class UseCalculation {
	public static void main(String[] args) {
		Calculation c=new Calculation();
		c.add(25,4);
		c.subtraction(25,5);
	/* int val=c.multiply(25,25);
	System.out.println(val); */
	System.out.println("MULTIPLY="+c.multiply(25,25));
	/*float val=c.divide(5,3);
	System.out.println(val);*/
	System.out.println("DIVIDE="+c.divide(5,3));
	
	}

}

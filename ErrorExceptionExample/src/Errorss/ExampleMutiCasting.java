package Errorss;

public class ExampleMutiCasting {
	public static void main(String[] args) {
	String a=null;
	String b="20";
	String c="30";
	try {
	int x=Integer.parseInt(a);
	int y=Integer.parseInt(b);
	int z=Integer.parseInt(c);
	int []i= {x,y,z};
	System.out.println(i[0]+i[1]);
	System.out.println(i[7]);
	System.out.println("hello");
}catch(NumberFormatException ne) {
	System.out.println(ne);
}catch(ArrayIndexOutOfBoundsException ae) {
	System.out.println(ae);
}catch(Exception e) {
	System.out.println("errors");
}
}


}

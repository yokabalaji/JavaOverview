package Basics;

public class Spr {
    public static void main(String[]args) {
	String[] rao=args[0].split(","); 
	int num=Integer.parseInt(rao[0]);
	int num1=Integer.parseInt(rao[1]);
	int add=num+num1;
	System.out.println(add);
}
}

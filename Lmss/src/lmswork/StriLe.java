package lmswork;

public class StriLe {
	public static void main(String[] args) {
		String a=args[0];
		String []b=a.split(",");
		int c=Integer.parseInt(b[0]);
		float d=Float.parseFloat(b[1]);
		String e=b[2];
		System.out.println(c+":"+d+":"+e.length());
		
	}

}

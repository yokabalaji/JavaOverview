package Lms;

public class GreaterThan4letterPrint {
	public static void main(String[] args) {
		String a=args[0];
		String b[]=a.split(",");
		String c[]= {b[0],b[1],b[2],b[3]};
		for(int i=0;i<c.length;i++) {
			if(c[i].length()>=4) {
				System.out.println(c[i]);
				
			}
		}
	}

}

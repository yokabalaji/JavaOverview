package Lms;

public class OddMulSquare {
	public static void main(String[] args) {
		String a=args[0];
		String []b=a.split(",");
		int d=Integer.parseInt(b[0]);
		int e=Integer.parseInt(b[1]);
		int f=Integer.parseInt(b[2]);
		int g=Integer.parseInt(b[3]);
		int c[]= {d,e,f,g};
		for(int i=0;i<c.length;i++) {
			if(c[i]>50) {
				System.out.println(c[i]);
			}else if(c[i]<50) {
				System.out.println(c[i]*c[i]);
			}
		}
		
	}

}

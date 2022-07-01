package ForloopArray;

public class TocharArrayreverse {
	public static void main(String[] args) {
		int i;
		String c=" ";
		String a="onesoft";
		char []b=a.toCharArray();
		for( i=b.length-1;i>=0;i--) {
			c=c+b[i];
			
			
		}
		System.out.println(c);
		
		
		
	}

}

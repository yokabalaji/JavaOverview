package ForLoopIfCondition;

public class Minimum {
	public static void main(String[] args) {
		int a[]= {20,102,-101,-22,26,201};
		int b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<b) {
				b=a[i];
				
				
			}
		}
		System.out.println(b);
	}

}

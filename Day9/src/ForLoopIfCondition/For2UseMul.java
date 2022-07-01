package ForLoopIfCondition;

public class For2UseMul {
	public static void main(String[] args) {
		int a[]= {1,2,4,5,6};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
		}
		System.out.println(max);
		long mul=1;
		for(int i=1;i<=max;i++) {
			mul=mul*i;
			
			System.out.println(mul);
		}
		System.out.println(mul);
	}

}

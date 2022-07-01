package ForLoopIfCondition;

public class minimumNum {
	public static void main(String[] args) {
		int a[]= {12,2242,567,87,979934,25346};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println(min);
	}

}

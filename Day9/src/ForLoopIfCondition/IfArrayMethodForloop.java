package ForLoopIfCondition;

public class IfArrayMethodForloop {
	public static void main(String[] args) {
		int []a= {11,212,32,4234,57,8,989,909};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

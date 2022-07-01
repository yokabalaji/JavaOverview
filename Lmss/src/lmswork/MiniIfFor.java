package lmswork;

public class MiniIfFor {
	public static void main(String[] args) {
	int	a[]= {1,33,45,67777777,-78686,8};
	int b=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<b) {
			 b=a[i];
		}
		
	}
	System.out.println(b);
	}

}

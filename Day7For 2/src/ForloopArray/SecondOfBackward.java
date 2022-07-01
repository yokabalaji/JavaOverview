package ForloopArray;

public class SecondOfBackward {
	public static void main(String[] args) {
		int a[]= {1,2,34,5,67,8,99,9,5,10};
		for(int i=a.length-1;i>=a.length/2;i--) {
			System.out.println(a[i]);
		}
	}

}

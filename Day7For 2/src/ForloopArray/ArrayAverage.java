package ForloopArray;

public class ArrayAverage {
	public static void main(String[] args) {
		int []num= {25,36,75,52,48};
		int tot=0;
		int count=0;
		for(int i=0;i<num.length;i++) {
			tot=tot+num[i];
			count=count+1;
		}
		System.out.println(tot/count);
	}

}

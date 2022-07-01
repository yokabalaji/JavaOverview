package ForLoopIfCondition;

public class OddTotCount {
	public static void main(String[] args) {
		int a=20;
		int total=0;
		int count=0;
		for(int i=0;i<=a;i++) {
			if(i%2!=0) {
			total+=i;
			count++;
			}
		}
		System.out.println("odd num tot="+total);
		System.out.println("odd count= "+count);
		System.out.println("avg= "+total/count);
	}

}

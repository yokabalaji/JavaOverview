package ForLoopIfCondition;

public class OddCount {
	public static void main(String[] args) {
		int a=20;
		int count=0;
		for(int i=0;i<=a;i++) {
			if(i%2!=0) {
				count++;
			}
			
		}
		System.out.println("ODD FOR LOOP COUNT= "+count);
	}

}

package ForLoopIfCondition;

public class EvenTotal {
	public static void main(String[] args) {
		int a=20;
		int total=0;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				total+=i;
			}
		}
		System.out.println("even counting total= "+total);
	}

}

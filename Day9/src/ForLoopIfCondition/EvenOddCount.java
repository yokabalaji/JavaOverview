package ForLoopIfCondition;

public class EvenOddCount {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				count++;
				
			}else  {
				count1++;
				
			}
		}
		System.out.println("even count "+count);
		System.out.println("odd count "+count1);
	}

}

package ForTLms;

public class FibonaciSeris {
	public static void main(String[] args) {
		int i;
		int f=0;
		int s=1;
		int t;
		int tot=0;
		for(i=1;i<6;i++) {
		//	System.out.println(f);
			
			 t=f+s;
			f=s;
			s=t;
			tot+=f;
			
		}
		System.out.println(tot);
		
	}

}

package mega;

public class UseWeekday {
	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		int c=Integer.parseInt(args[2]);
		Weekday w=new Weekday();
		w.findDay(a);
		w.findDay(b,c);
		
	}

}
